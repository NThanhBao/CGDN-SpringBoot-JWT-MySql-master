package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.http.ResponseEntity;

public interface ProductService {

    ResponseEntity<?> put(Product productMoto);
    ResponseEntity<?> get();
}
