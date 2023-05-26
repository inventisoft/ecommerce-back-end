package com.inventisoft.productservice.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity Product
 * 
 * @author atthort-arch
 *
 */

@Entity 
@javax.persistence.Table(name = "is_product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private BigDecimal priceBefore;
	private BigDecimal priceAfter;
	private String shortDescription;
	private String longDescription;
	private String additionalInformation;
	private String size;
	private String brand;
	private Timestamp createdAt;
	
/**
 * Setter and getters table: is_product
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
	public BigDecimal getPriceBefore() {
		return priceBefore;
	}
	public void setPriceBefore(BigDecimal priceBefore) {
		this.priceBefore = priceBefore;
	}
	public BigDecimal getPriceAfter() {
		return priceAfter;
	}
	public void setPriceAfter(BigDecimal priceAfter) {
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