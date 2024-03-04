package com.ecom.practice.Dto.Request;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AddProduct {
  private String name;

  private String details;

  private double price;

  private MultipartFile data;
}
