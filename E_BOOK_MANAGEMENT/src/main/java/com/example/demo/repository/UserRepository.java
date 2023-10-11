package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.UserCreation;



public interface UserRepository extends JpaRepository< UserCreation,Integer> {

}
