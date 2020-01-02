package com.course.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
