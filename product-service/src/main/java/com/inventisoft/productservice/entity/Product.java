package com.inventisoft.productservice.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity Product
 * 
 * @author atthort-arch
 *
 */

@Entity 
@Table(name = "is_product")
@Getter
@Setter
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "product_id", columnDefinition = "bigint", nullable = false)
	private Integer id;
	
	@Column(name = "category_id", columnDefinition = "integer", nullable = false)
	private Integer categoryId;
	
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
	
	@Column(name = "create_at", columnDefinition = "timestamp", nullable = true)
	private Timestamp createdAt;

}
