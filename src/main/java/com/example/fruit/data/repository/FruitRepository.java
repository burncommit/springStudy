package com.example.fruit.data.repository;

import com.example.fruit.data.entity.FruitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<FruitEntity, Integer> {
}
