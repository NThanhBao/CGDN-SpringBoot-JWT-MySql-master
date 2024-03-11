package com.example.demo.controller;

import com.example.demo.entity.ProductMoto;
import com.example.demo.service.ProductMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin/productcar")
@RestController
public class ProductCarController {
    @Autowired
    ProductMotoService productMotoService;

    @PostMapping("/add")
    public ResponseEntity<?> addProduct(@RequestBody ProductMoto productMoto){
        return productMotoService.put(productMoto);
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllProductCar(){
        return productMotoService.get();
    }
}
