package com.inventisoft.productservice.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 * @author atthort-arch
 */
public class ProductDto {
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
    
 
/**
 * DTOS Products
 */
    public ProductDto() {}


/**
 * @param id
 * @param name
 * @param priceBefore
 * @param priceAfter
 * @param shortDescription
 * @param longDescription
 * @param additionalInformation
 * @param size
 * @param brand
 * @param createdAt
 */
	public ProductDto(int id, String name, String priceBefore, String priceAfter, String shortDescription,
			String longDescription, String additionalInformation, String size, String brand, Timestamp createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.priceBefore = priceBefore;
		this.priceAfter = priceAfter;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.additionalInformation = additionalInformation;
		this.size = size;
		this.brand = brand;
		this.createdAt = createdAt;
	}

/**
 * Setters and getters table: is_product
 * @return
 */
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPriceBefore() {
		return priceBefore;
	}



	public void setPriceBefore(String priceBefore) {
		this.priceBefore = priceBefore;
	}



	public String getPriceAfter() {
		return priceAfter;
	}



	public void setPriceAfter(String priceAfter) {
		this.priceAfter = priceAfter;
	}



	public String getShortDescription() {
		return shortDescription;
	}



	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}



	public String getLongDescription() {
		return longDescription;
	}



	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}



	public String getAdditionalInformation() {
		return additionalInformation;
	}



	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public Timestamp getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

    

}