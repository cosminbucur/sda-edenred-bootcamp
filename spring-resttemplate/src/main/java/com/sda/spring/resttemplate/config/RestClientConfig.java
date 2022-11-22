package com.sda.spring.resttemplate.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.sda.spring.resttemplate.interceptors.HeaderModifierInterceptor;

@Configuration
public class RestClientConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .interceptors(new HeaderModifierInterceptor())
                .build();
    }
}
