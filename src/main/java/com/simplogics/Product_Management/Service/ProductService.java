package com.simplogics.Product_Management.Service;
import java.util.List;
import com.simplogics.Product_Management.Model.Product;
import com.simplogics.Product_Management.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    
    public Product getProductById(Integer id){
        return productRepository.findById(id).orElse(null);
    }

    public String deleteProduct(Integer id){
        productRepository.deleteById(id);
        return "PRODUCT DELETED";
    }
}
