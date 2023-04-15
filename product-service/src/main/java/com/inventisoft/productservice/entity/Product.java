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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "product_id", columnDefinition = "bigint", nullable = false)
	private Integer id;
	
	@Column(name = "code", columnDefinition = "varchar(50)", nullable = false)
	private String code;
	
	@Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
	private String name;
	
	@Column(name = "price_before", columnDefinition = "decimal(10,2)", nullable = false)
	private BigDecimal priceBefore;
	
	@Column(name = "price_after", columnDefinition = "decimal(10,2)", nullable = true)
	private BigDecimal priceAfter;
	
	@Column(name = "short_description", columnDefinition = "varchar(500)", nullable = false)
	private String shortDescription;
	
	@Column(name = "long_description", columnDefinition = "varchar(300)", nullable = false)
	private String longDescription;
	
	@Column(name = "additional_information", columnDefinition = "varchar(3000)", nullable = false)
	private String additionalInformation;
	
	@Column(name = "size", columnDefinition = "varchar(100)", nullable = false)
	private String size;
	
	@Column(name = "color", columnDefinition = "varchar(50)", nullable = false)
	private String color;
	
	@Column(name = "brand", columnDefinition = "varchar(50)", nullable = false)
	private String brand;
	
	@Column(name = "create_at", columnDefinition = "datetime", nullable = false)
	private Timestamp createdAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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