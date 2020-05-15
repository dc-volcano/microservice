package com.volcano.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

/**
 * SpringCloud相关配置
 * @author Administrator
 *
 */
@Configuration
public class SpringCloudConfig {
 
    /**
     * 调用服务模版
     * @return
     */
    @Bean
    @LoadBalanced //ribbon负载
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    
    /**
     * 
     * @return
     */
    @Bean
    public IRule getRule() {
    	return new RetryRule();
    }
}
