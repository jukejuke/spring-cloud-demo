package com.springcloud.eurekagataway.config;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.RewritePathGatewayFilterFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.UriSpec;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * @program: spring-cloud-demo2
 * @description: Gataway配置
 * @author: yaosh
 * @create: 2021-04-29 15:56
 */
@Configuration
public class GatewayRoutes {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        //配置过滤规则
        RewritePathGatewayFilterFactory.Config config = new RewritePathGatewayFilterFactory.Config();
        config.setRegexp("/single-provider/(?<segment>.*)");
        config.setReplacement("/${segment}");
        GatewayFilter filter = new RewritePathGatewayFilterFactory()
                .apply(config);
        Function<GatewayFilterSpec, UriSpec> fn = gatewayFilterSpec -> gatewayFilterSpec.filter(filter);

        return builder.routes()
                .route(r ->
                        r.path("/eureka-consumer/**")
                                .filters(
                                        f -> f.stripPrefix(1)
                                )
                                .uri("http://localhost:8075")
                )
                .route(r -> r.path("/single-provider/**").filters(fn).uri("lb://single-provider"))
                .build();
    }

}
