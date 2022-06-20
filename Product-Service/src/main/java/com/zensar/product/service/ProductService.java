package com.zensar.product.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;

import com.zensar.product.dto.ProductDto;

public interface ProductService {
	public ProductDto getProduct(int productId);

	public List<ProductDto> getAllProducts(int pageNumber, int pageSize, String sortBy, Direction ord);

	public ProductDto insert(ProductDto productDto);

	public void update(int productId, ProductDto productDto);

	public void delete(int productId);
	public List<ProductDto> getByProductName(String productName);
	public ResponseEntity<List<ProductDto>> getByProductNameAndProductCost(String productName,int productCost);
	public List<ProductDto> getByProductNameOrderByProductQuntity(String productName);
	//List<ProductDto> testProductName(String productName);

	
	
	
	 
}
