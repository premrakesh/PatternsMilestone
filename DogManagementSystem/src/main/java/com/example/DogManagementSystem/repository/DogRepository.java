package com.example.DogManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DogManagementSystem.Models.Dog;

import com.example.DogManagementSystem.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name);
}
