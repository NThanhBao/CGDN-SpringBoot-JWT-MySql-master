package com.example.demo.service;

import com.example.demo.entity.Role;
import org.springframework.http.ResponseEntity;

public interface RoleService {
    ResponseEntity<?> put(Role role);
}
