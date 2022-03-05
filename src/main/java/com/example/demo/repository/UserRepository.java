package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Employee, Long> {
    Employee findByUsername(String username);
}
