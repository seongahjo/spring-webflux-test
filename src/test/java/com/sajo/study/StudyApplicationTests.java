package com.sajo.study;

import com.sajo.study.configuration.WebConfiguration;
import com.sajo.study.handler.HelloWorldHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebFluxTest
//@WebMvcTest
@Import({WebConfiguration.class,HelloWorldHandler.class})
public class StudyApplicationTests {

    @Autowired
    public WebTestClient webClient;


    @Test
    public void hello() throws Exception{
        //exchange -> 요청
       String value = webClient.get().uri("/hello").exchange()
        .expectStatus().isOk()
               .expectBody(String.class)
               .returnResult().getResponseBody();
       //return Result?
        assertThat(value).isEqualTo("Hello World!");
    }

}
