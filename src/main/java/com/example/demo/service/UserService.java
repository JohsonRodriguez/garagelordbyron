package com.example.demo.service;

import com.example.demo.dto.UpdatePasswordDto;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Role;
import org.springframework.http.ResponseEntity;


import java.util.List;

public interface UserService {
    ResponseEntity<?> saveUser(Employee employee);
    ResponseEntity<?> saveRole (Role role);
    void addRoleToUser(String username, String roleName);
    void removeRoleToUser(String username, String roleName);
    ResponseEntity<?> getUser(String username);
    List<Employee> getUsers();
    ResponseEntity<?> updateUser(Employee employee);
    ResponseEntity<?> changeUserStatus (String username, boolean isEnabled);
    ResponseEntity<?> changePassword(UpdatePasswordDto updatePassword);
}