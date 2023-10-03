package com.microservices.productinventory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.microservices.productinventory.model.Inventory;
import com.microservices.productinventory.repository.InventoryRepository;

@SpringBootApplication
// @ComponentScan(basePackages = { "com.microservices.productinventory.service",
// "com.microservices.productinventory.repository",
// "com.microservices.productinventory.controller",
// "com.microservices.productinventory.dto",
// "com.microservices.productinventory.model" })
public class ProductInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInventoryApplication.class, args);
	}

	@Bean
	CommandLineRunner loadData(InventoryRepository inventoryRepository) {

		return args -> {

			Inventory inventory = new Inventory();
			inventory.setQuantity(100);
			inventory.setSkuCode("iphone12");

			Inventory inventory2 = new Inventory();
			inventory2.setQuantity(100);
			inventory2.setSkuCode("iphone12_blue");

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory2);
		};
	}
}
