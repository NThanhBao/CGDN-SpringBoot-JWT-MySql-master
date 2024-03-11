package com.example.demo.service.serviceImpl;

import com.example.demo.entity.ProductMoto;
import com.example.demo.repositories.ProductCarRepository;

import com.example.demo.service.ProductMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductCarImpl implements ProductMotoService {
    @Autowired
    ProductCarRepository productCarRepository;
    @Override
    public ResponseEntity<?> put(ProductMoto productMoto) {
        return new ResponseEntity<>( productCarRepository.save(productMoto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> get() {
        return  new ResponseEntity<>( productCarRepository.findAll(), HttpStatus.OK);
    }
}
