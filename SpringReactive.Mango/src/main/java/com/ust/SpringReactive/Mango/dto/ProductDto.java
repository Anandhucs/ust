package com.ust.SpringReactive.Mango.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "prdducts")
public class ProductDto {
  private  String id;
  private  String name;
  private  int qty;
  private  double price;

}
