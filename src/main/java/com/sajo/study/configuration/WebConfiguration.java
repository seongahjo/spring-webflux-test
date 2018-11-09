package com.sajo.study.configuration;

import com.sajo.study.handler.HelloWorldHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
@EnableWebFlux
public class WebConfiguration {
    @Bean
    public RouterFunction<ServerResponse> routes(HelloWorldHandler handler){
        return RouterFunctions.route(GET("/hello"),handler::helloWorld);
    }
}
