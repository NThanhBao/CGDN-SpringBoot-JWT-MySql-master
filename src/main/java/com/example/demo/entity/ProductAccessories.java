package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ProductAccessories")
@Data
public class ProductAccessories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private long price;
    private long quantity;

    @ManyToOne
    @JoinColumn(name = "id_TypeCar", nullable = false)
    TypeProduct typeProduct;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "productAccessories_id")
    //  @JsonIgnoreProperties({"id"})
    @Lob
    private List<ImgAccessories> images = new ArrayList<>();
}
