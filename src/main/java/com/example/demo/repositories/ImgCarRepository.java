package com.example.demo.repositories;

import com.example.demo.entity.ImgMoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgCarRepository extends JpaRepository<ImgMoto,Long> {
}
