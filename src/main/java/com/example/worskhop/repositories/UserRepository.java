package com.example.worskhop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.worskhop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
