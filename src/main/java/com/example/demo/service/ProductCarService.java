package com.example.demo.service;

import com.example.demo.entity.ProductCar;
import com.example.demo.entity.TypeProductCar;
import org.springframework.http.ResponseEntity;

public interface ProductCarService {



    ResponseEntity<?> put(ProductCar productCar);
    ResponseEntity<?> get();
}
