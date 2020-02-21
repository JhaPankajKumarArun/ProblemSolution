package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ProductService {
	public static void main(String[] args) { 
		SpringApplication.run(ProductService.class, args);
	}

	@RequestMapping("/getProduct")
	public List<String> getProducs(@RequestHeader("x-location") String location) {
		List<String> productList = new ArrayList<>();
		productList.add("Cotton-shirt");
		productList.add("Denim-shirt"); 
		productList.add("Rayon-shirt");
		System.out.println(" Request comes from -> "+ location);
		return productList;
	}
}
