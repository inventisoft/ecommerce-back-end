/**
 * 
 */
package com.inventisoft.productservice.vo;

import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * @author atthort-arch
 *
 */
@javax.persistence.Table(name = "is_product")
public class ProductVo {
	@Column(name = "product_id", columnDefinition = "bigint", nullable = false)
	private Integer id;
	
	@Column(name = "code", columnDefinition = "varchar(50)", nullable = false)
	private String code;
	
	@Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
	private String name;
	
	@Column(name = "short_description", columnDefinition = "varchar(500)", nullable = false)
	private String shortDescription;
	
	@Column(name = "long_description", columnDefinition = "varchar(300)", nullable = false)
	private String longDescription;
	
	@Column(name = "additional_information", columnDefinition = "varchar(3000)", nullable = false)
	private String additionalInformation;
	
	@Column(name = "brand", columnDefinition = "varchar(50)", nullable = false)
	private String brand;
	
	@Column(name = "create_at", columnDefinition = "timestamp default current_timestamp", nullable = true)
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
