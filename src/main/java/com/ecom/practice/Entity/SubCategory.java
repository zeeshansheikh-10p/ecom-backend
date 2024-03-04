package com.ecom.practice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class SubCategory {
  @Id
  @GeneratedValue
  private Long id;


}
