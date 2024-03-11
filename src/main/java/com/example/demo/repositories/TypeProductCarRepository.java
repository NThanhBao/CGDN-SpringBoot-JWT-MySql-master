package com.example.demo.repositories;

import com.example.demo.entity.TypeProductCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProductCarRepository extends JpaRepository<TypeProductCar,Long> {
    TypeProductCar  findByNameType(String nameType);
}
