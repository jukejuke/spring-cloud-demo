package com.springcloud.eurekagataway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        return builder.routes()
                .route(r ->
                        r.path("/eureka-consumer/**")
                                .filters(
                                        f -> f.stripPrefix(1)
                                )
                                .uri("http://localhost:8075")
                )
                .build();
    }

}
