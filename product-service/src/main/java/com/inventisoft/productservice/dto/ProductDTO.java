package com.inventisoft.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

  private Integer id;
  private Integer categoryId;
  private String code;
  private String name;
  private String shortDescription;
  private String longDescription;
  private String additionalInformation;
  private String brand;

}
