package com.app.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employee.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
