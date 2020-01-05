package com.course.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.course.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
