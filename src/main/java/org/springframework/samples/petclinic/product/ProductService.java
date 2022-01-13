package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products;
    }

    public List<Product> getProductsCheaperThan(double price) {
        List<Product> products = productRepository.findByPriceLessThan(price);
        return products;
    }

    public ProductType getProductType(String typeName) {
        ProductType type = productRepository.findTypeByName(typeName);
        return type;
    }

    public Product save(Product p){
        return null;       
    }

    
}
