package com.example.demo.service;

import com.example.demo.entity.TypeProduct;
import org.springframework.http.ResponseEntity;

public interface TypeProductService {
    ResponseEntity<?> put(TypeProduct typeProduct);

}
