package com.example.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ClientApplication {

	@Autowired
	private EurekaClient client;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	@RequestMapping("/inventory")
	public List getInventoryList() {
		RestTemplate restTemplate= restTemplateBuilder.build();
		InstanceInfo instanceInfo= client.getNextServerFromEureka("inventory-service", false);
		String baseUrl= instanceInfo.getHomePageUrl();
		ResponseEntity<List> response= restTemplate.exchange(baseUrl+"inventories", HttpMethod.GET,null,List.class);
		return response.getBody();		
		
	}
	
	@RequestMapping("/products")
	public List getProductList() {
		RestTemplate restTemplate= restTemplateBuilder.build();
		InstanceInfo instanceInfo= client.getNextServerFromEureka("product-service", false);
		String baseUrl= instanceInfo.getHomePageUrl();
		ResponseEntity<List> response= restTemplate.exchange(baseUrl+"getProduct", HttpMethod.GET,null,List.class);
		return response.getBody();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
