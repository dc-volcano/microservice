package com.volcano.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.volcano.filter.AccessFilter;

@Configuration
public class ZuulConfig {

	@Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
