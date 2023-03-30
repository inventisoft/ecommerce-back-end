package com.inventisoft.productservice.Entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class is_product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//atributes table
	private Integer product_id;
	private String product_code;
	private String product_name;
	private BigDecimal product_price_before;
	private BigDecimal product_price_after;
	private String product_short_description;
	private String product_long_description;
	private String product_additional_information;
	private String product_size;
	
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public BigDecimal getProduct_price_before() {
		return product_price_before;
	}
	public void setProduct_price_before(BigDecimal product_price_before) {
		this.product_price_before = product_price_before;
	}
	public BigDecimal getProduct_price_after() {
		return product_price_after;
	}
	public void setProduct_price_after(BigDecimal product_price_after) {
		this.product_price_after = product_price_after;
	}
	public String getProduct_short_description() {
		return product_short_description;
	}
	public void setProduct_short_description(String product_short_description) {
		this.product_short_description = product_short_description;
	}
	public String getProduct_long_description() {
		return product_long_description;
	}
	public void setProduct_long_description(String product_long_description) {
		this.product_long_description = product_long_description;
	}
	public String getProduct_additional_information() {
		return product_additional_information;
	}
	public void setProduct_additional_information(String product_additional_information) {
		this.product_additional_information = product_additional_information;
	}
	public String getProduct_size() {
		return product_size;
	}
	public void setProduct_size(String product_size) {
		this.product_size = product_size;
	}
	
	
	
}
