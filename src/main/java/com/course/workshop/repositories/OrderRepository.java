package com.course.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
