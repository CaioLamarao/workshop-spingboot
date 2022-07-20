package com.example.worskhop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.worskhop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
