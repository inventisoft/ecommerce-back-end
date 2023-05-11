package com.inventisoft.productservice.mapper;

import com.inventisoft.productservice.dto.ProductDTO;
import com.inventisoft.productservice.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

  Product productDtoToProduct(ProductDTO productDTO);
}

