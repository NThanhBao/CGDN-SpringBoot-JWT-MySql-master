package com.example.demo.controller;

import com.example.demo.entity.ProductCar;
import com.example.demo.service.ProductCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin/productcar")
@RestController
public class ProductCarController {
    @Autowired
    ProductCarService productCarService;

    @PostMapping("/add")
    public ResponseEntity<?> addProduct(@RequestBody ProductCar productCar){
        return productCarService.put(productCar);
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllProductCar(){
        return productCarService.get();
    }
}
