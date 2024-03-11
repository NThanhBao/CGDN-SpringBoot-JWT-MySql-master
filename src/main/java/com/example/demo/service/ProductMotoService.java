package com.example.demo.service;

import com.example.demo.entity.ProductMoto;
import org.springframework.http.ResponseEntity;

public interface ProductMotoService {

    ResponseEntity<?> put(ProductMoto productMoto);
    ResponseEntity<?> get();
}
