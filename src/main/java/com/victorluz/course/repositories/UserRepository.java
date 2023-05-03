package com.victorluz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorluz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
