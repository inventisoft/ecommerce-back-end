/**
 * 
 */
package com.inventisoft.productservice.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author atthort-arch
 *
 */

public class ProductVo {
	private Integer id;
	private String code;
	private String name;
	private BigDecimal priceBefore;
	private BigDecimal priceAfter;
	private String shortDescription;
	private String longDescription;
	private String additionalInformation;
	private String size;
	private String color;
	private String brand;
	private Timestamp createdAt;
}
