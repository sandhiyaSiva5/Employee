package com.example.employee.Service;

import com.example.employee.Model.Product;
import com.example.employee.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(long id, Product productDetails) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setProductName(productDetails.getProductName());
            product.setProductColour(productDetails.getProductColour());
            product.setCategory(productDetails.getCategory());
            product.setBudget(productDetails.getBudget());
            product.setSize(productDetails.getSize());
            product.setImage(productDetails.getImage());
            product.setTotalQuality(productDetails.getTotalQuality());
            product.setProductCount(productDetails.getProductCount());
            product.setRating(productDetails.getRating());
            product.setDiscount(productDetails.getDiscount());
            product.setFabric(productDetails.getFabric());
            product.setOccasion(productDetails.getOccasion());
            product.setBrand(productDetails.getBrand());
            return productRepository.save(product);
        } else {
            return null;
        }
    }

    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }
}
