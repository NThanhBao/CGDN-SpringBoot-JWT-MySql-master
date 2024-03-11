package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ProductCar")
@Data
public class ProductCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private long price;
    private long quantity;

    @ManyToOne
    @JoinColumn(name = "id_TypeCar", nullable = false)
    TypeProductCar typeProductCar;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    //  @JsonIgnoreProperties({"id"})
    @Lob
    private List<ImgCar> images = new ArrayList<>();
}
