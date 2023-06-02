package com.inventisoft.productservice.dto;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private int id;
    private String name;
    private String priceBefore;
    private String priceAfter;
    private String shortDescription;
    private String longDescription;
    private String additionalInformation;
    private String size;
    private String brand;
    private Timestamp createdAt;
}
