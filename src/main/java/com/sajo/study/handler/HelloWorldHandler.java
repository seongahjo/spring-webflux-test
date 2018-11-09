package com.sajo.study.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class HelloWorldHandler {
    public Mono<ServerResponse> helloWorld(ServerRequest request){
        Mono<String> helloWorldMono = Mono.just("Hello World!");
        log.info("route");
        log.info("Commit test");
        return ServerResponse.ok().body(helloWorldMono,String.class);
    }

}
