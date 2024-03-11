package com.example.demo.repositories;

import com.example.demo.entity.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProductCarRepository extends JpaRepository<TypeProduct,Long> {
    TypeProduct findByNameType(String nameType);
}
