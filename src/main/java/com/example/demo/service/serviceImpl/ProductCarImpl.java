package com.example.demo.service.serviceImpl;

import com.example.demo.entity.ProductCar;
import com.example.demo.repositories.ProductCarRepository;
import com.example.demo.service.ProductCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductCarImpl implements ProductCarService {
    @Autowired
    ProductCarRepository productCarRepository;
    @Override
    public ResponseEntity<?> put(ProductCar productCar) {
        return new ResponseEntity<>( productCarRepository.save(productCar), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> get() {
        return  new ResponseEntity<>( productCarRepository.findAll(), HttpStatus.OK);
    }
}
