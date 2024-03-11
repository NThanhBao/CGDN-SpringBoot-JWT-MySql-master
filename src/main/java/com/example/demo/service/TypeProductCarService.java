package com.example.demo.service;

import com.example.demo.entity.TypeProductCar;
import org.springframework.http.ResponseEntity;

public interface TypeProductCarService {
    ResponseEntity<?> put(TypeProductCar typeProductCar);

}
