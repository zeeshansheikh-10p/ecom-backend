package com.ecom.practice.Controller;

import com.ecom.practice.Dto.Request.AddProduct;
import com.ecom.practice.Entity.Product;
import com.ecom.practice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/product")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping
  public ResponseEntity<?> addProduct(@RequestPart AddProduct addProduct,
                                       @RequestPart MultipartFile image) throws IOException {
    addProduct.setData(image);
    Product product = productService.addProduct(addProduct);
    return ResponseEntity.ok(product);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Product> getImage(@PathVariable Long id) {
    Product product = productService.getProduct(id);
    if (product != null) {
      return ResponseEntity.ok().body(product);
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
