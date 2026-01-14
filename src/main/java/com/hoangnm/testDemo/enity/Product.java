package com.hoangnm.testDemo.enity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Length;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private  String name;

    private Double price;

    @Column(length=1000)
    private String description;

    private String imageUrl;

    //khi đánh dấu @enity, mặc định tất cả các thuộc tính sẽ được coi là một cột trong database
    //khi dùng @column là để thay đổi các thay đổi mặc định
}
