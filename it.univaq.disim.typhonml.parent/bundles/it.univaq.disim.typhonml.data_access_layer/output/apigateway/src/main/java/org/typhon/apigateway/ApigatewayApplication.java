package org.typhon.apigateway;
	
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
	
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
	
@Configuration
@SpringBootApplication
//@EnableSwagger2
public class ApigatewayApplication {

	@Bean
	RouteLocator gatewayArtifactServiceRouter(RouteLocatorBuilder builder){
        return builder.routes()
				.route(r -> r.path("/comment/**").and().method("GET")
                        .filters(f-> f.rewritePath("/comment","/comment"))
                        .uri("http://localhost:8090"))
                .route(r -> r.path("/comment").and().method("POST")
                        .filters(f-> f.rewritePath("/comment","/comment"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/comment/**").and().method("PUT")
                        .filters(f-> f.rewritePath("/comment","/comment"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/comment/**").and().method("DELETE")
                        .filters(f-> f.rewritePath("/comment","/comment"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
			
				.route(r -> r.path("/creditcard/**").and().method("GET")
                        .filters(f-> f.rewritePath("/creditcard","/creditcard"))
                        .uri("http://localhost:8091"))
                .route(r -> r.path("/creditcard").and().method("POST")
                        .filters(f-> f.rewritePath("/creditcard","/creditcard"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/creditcard/**").and().method("PUT")
                        .filters(f-> f.rewritePath("/creditcard","/creditcard"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/creditcard/**").and().method("DELETE")
                        .filters(f-> f.rewritePath("/creditcard","/creditcard"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
			
				.route(r -> r.path("/order/**").and().method("GET")
                        .filters(f-> f.rewritePath("/order","/order"))
                        .uri("http://localhost:8092"))
                .route(r -> r.path("/order").and().method("POST")
                        .filters(f-> f.rewritePath("/order","/order"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/order/**").and().method("PUT")
                        .filters(f-> f.rewritePath("/order","/order"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/order/**").and().method("DELETE")
                        .filters(f-> f.rewritePath("/order","/order"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
			
				.route(r -> r.path("/review/**").and().method("GET")
                        .filters(f-> f.rewritePath("/review","/review"))
                        .uri("http://localhost:8093"))
                .route(r -> r.path("/review").and().method("POST")
                        .filters(f-> f.rewritePath("/review","/review"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/review/**").and().method("PUT")
                        .filters(f-> f.rewritePath("/review","/review"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/review/**").and().method("DELETE")
                        .filters(f-> f.rewritePath("/review","/review"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
			
				.route(r -> r.path("/user/**").and().method("GET")
                        .filters(f-> f.rewritePath("/user","/user"))
                        .uri("http://localhost:8094"))
                .route(r -> r.path("/user").and().method("POST")
                        .filters(f-> f.rewritePath("/user","/user"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/user/**").and().method("PUT")
                        .filters(f-> f.rewritePath("/user","/user"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
                .route(r -> r.path("/user/**").and().method("DELETE")
                        .filters(f-> f.rewritePath("/user","/user"))
                        .uri("http://localhost:[basePort + getAllModelEntitiesUtilityOrdered(aModel)->indexOf(e)/]"))
			
				.build();
    }
		
	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}
}