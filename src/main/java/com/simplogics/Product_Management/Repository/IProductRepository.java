package com.simplogics.Product_Management.Repository;

import com.simplogics.Product_Management.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {

}
