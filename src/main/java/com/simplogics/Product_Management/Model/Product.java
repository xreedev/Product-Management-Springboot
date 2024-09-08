package com.simplogics.Product_Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table
public class Product {
    @Id
    @GeneratedValue
    private Integer pid;
    private String name;
    private Integer quantity;
    private Integer price;

}
