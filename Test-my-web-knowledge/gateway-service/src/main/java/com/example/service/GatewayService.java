package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.filter.AddRequestHeader;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@Configuration
public class GatewayService {
	public static void main(String[] args) {
		SpringApplication.run(GatewayService.class, args);
	}
	
	@Bean
	public AddRequestHeader addRequestHeaderFilter() {
		return new AddRequestHeader();
	}
}
