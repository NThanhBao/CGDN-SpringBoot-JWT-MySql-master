package com.example.demo;

import com.example.demo.entity.Role;
import com.example.demo.entity.TypeProduct;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.TypeProducRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    TypeProducRepository typeProductRepository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    //thêm dữ liệu test
    //thêm 1 lần r tắt
    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
//        AddRole("ADMIN");
//        AddRole("USER");
//       System.out.println("Đã thêm role ");
//
//        addType("Xe rong ");
//        addType("Xe phuong ");
//        System.out.println("Đã thêm type product ");
    }
    private void addType(String type){
        TypeProduct typeProduct=new TypeProduct();
        typeProduct.setNameType(type);
        typeProductRepository.save(typeProduct);
    }
    private void AddRole(String role){
        Role addRole =new Role();
        addRole.setRole(role);
        roleRepository.save(addRole);
    }
}
