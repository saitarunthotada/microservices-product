package com.microservices.productorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.productorder.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
