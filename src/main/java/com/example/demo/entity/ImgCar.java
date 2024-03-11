package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ImgCar")
@Data
public class ImgCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImg;

    private String imgBase64;

    private String content;
}
