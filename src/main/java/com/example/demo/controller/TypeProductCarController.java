package com.example.demo.controller;

import com.example.demo.entity.TypeProductCar;
import com.example.demo.service.TypeProductCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/typeCar")
@Controller
public class TypeProductCarController {

    @Autowired
    TypeProductCarService typeProductCarService;


    @PostMapping("/add")

    public ResponseEntity<?> addTypeProduct(@RequestBody TypeProductCar typeProductCar){
        return typeProductCarService.put(typeProductCar);
    }
}
