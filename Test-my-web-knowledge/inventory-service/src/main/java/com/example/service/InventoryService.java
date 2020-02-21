package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class InventoryService {

	@Value("${service.instance.name}")
	private String instance;
	public static void main(String[] args) {
		SpringApplication.run(InventoryService.class, args);
	}

	@RequestMapping("/inventories")
	public List<Product> getInventoryList() {
		List<Product> inventoryList= new ArrayList<>();
		Product p = new Product();
		p.setName("Cotton-shirt");
		p.setCount(1);
		
		Product p1 = new Product();
		p1.setName("Denim-shirt");
		p1.setCount(1);
		
		Product p2 = new Product();
		p2.setName("Rayon-shirt");
		p2.setCount(1);
		
		inventoryList.add(p);
		inventoryList.add(p1);
		inventoryList.add(p2);
		return  inventoryList;
	}
}

class Product{
	String name;
	int count;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}