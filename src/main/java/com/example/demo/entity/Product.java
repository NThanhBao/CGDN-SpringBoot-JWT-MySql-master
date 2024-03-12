package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private long price;
    private long quantity;

    private int  discount;

    @ManyToOne
    @JoinColumn(name = "id_TypeCar", nullable = false)
    TypeProduct typeProduct;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "productMoto_id")
    //  @JsonIgnoreProperties({"id"})
    @Lob
    private List<Img> images = new ArrayList<>();
}
