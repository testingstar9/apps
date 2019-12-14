package com.app.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employee.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
