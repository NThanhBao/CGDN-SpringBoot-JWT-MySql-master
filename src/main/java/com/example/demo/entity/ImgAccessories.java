package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ImgAccessories")
@Data
public class ImgAccessories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImg;

    private String imgBase64;

    private String content;
}
