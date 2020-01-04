package com.course.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
