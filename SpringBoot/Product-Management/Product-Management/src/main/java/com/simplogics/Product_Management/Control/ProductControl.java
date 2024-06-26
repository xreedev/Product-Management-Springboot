package com.simplogics.Product_Management.Control;

import com.simplogics.Product_Management.Model.Product;
import com.simplogics.Product_Management.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControl {
    @Autowired
    ProductService productService;

    @PostMapping("/createProduct")
    public Product addProduct(Product product){
        return productService.saveProduct(product);
    }

    @PutMapping("/saveProduct")
    public Product saveProduct(Product product){
        return productService.saveProduct(product);
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @GetMapping("/getAll")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return productService.deleteProduct(id);
    }

}
