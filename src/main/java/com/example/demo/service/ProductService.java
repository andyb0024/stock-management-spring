package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public  Product updateProduct(Product product){
        Product getProductId = productRepository.findById(product.getPid()).orElse(null);
        assert getProductId != null;
        getProductId.setPname(product.getPname());
        getProductId.setPrice(product.getPrice());
        getProductId.setQty(product.getQty());
        return productRepository.save(getProductId);

    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "product removed !! " + id;

    }


}
