package com.example.worskhop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.worskhop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
