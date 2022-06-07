package com.cg.ApiGateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()





				.route(p -> p.path("/user/*").uri("http://localhost:8086"))





				.route(p -> p.path("/Cart/*").uri("http://localhost:8081"))





				.route(p -> p.path("/product/*").uri("http://localhost:8098"))





				.route(p -> p.path("/Order-service/*").uri("http://localhost:8082"))





				.route(p -> p.path("/payment/*").uri("http://localhost:8084")).build();
	}






}
