package com.volcano.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * SpringCloud相关配置
 * @author Administrator
 *
 */
@Configuration
public class SpringCloudConfig {
 
    /**
     * 
     * @return
     */
    @Bean
    public IRule getRule() {
    	return new RandomRule();
    }
}
