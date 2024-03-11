package com.example.demo.repositories;

import com.example.demo.entity.ProductMoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMotoRepository extends JpaRepository<ProductMoto,Long> {

}
