package com.victorluz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorluz.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
