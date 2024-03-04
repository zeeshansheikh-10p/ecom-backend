package com.ecom.practice.Service;

import com.ecom.practice.Dto.Request.AddProduct;
import com.ecom.practice.Entity.Product;
import com.ecom.practice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public Product addProduct(AddProduct addProduct) throws IOException {
    Product product = new Product();
    product.setName(addProduct.getName());
    product.setData(addProduct.getData().getBytes());
    product.setPrice(addProduct.getPrice());
    product.setDetails(addProduct.getDetails());
    return productRepository.save(product);
  }

  public Product getProduct(Long id) {
    return productRepository.findById(id).orElse(null);
  }
}
