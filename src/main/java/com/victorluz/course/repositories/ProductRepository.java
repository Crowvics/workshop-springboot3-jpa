package com.victorluz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorluz.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
