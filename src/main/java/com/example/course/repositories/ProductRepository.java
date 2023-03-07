package com.example.course.repositories;


import com.example.course.entitie.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
