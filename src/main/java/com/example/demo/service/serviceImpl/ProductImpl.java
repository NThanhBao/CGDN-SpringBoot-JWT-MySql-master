package com.example.demo.service.serviceImpl;

import com.example.demo.entity.Product;
import com.example.demo.repositories.ProductRepository;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public ResponseEntity<?> put(Product productMoto) {
        return new ResponseEntity<>( productRepository.save(productMoto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> get() {
        return  new ResponseEntity<>( productRepository.findAll(), HttpStatus.OK);
    }
}
