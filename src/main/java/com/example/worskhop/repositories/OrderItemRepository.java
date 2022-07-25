package com.example.worskhop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.worskhop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
