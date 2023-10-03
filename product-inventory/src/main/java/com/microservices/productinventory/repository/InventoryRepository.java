package com.microservices.productinventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.productinventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
