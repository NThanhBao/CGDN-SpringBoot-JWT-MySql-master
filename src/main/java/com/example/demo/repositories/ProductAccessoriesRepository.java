package com.example.demo.repositories;

import com.example.demo.entity. ProductAccessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAccessoriesRepository extends JpaRepository<ProductAccessories,Long> {
}
