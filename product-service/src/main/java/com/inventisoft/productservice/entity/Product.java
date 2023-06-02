package com.inventisoft.productservice.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

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
}
