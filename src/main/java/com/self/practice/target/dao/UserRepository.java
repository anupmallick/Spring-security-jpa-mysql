package com.self.practice.target.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.self.practice.target.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
