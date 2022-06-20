package com.zensar.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.zensar.product.dto.ProductDto;
import com.zensar.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<ProductDto> findByProductName(String productName);
	ResponseEntity<List<ProductDto>> getByProductNameAndProductCost(String productName, int productCost);
	List<Product> findByProductNameOrderByProductQuntity(String productName);

	// List<Product> byName(String productName);
	// @Query(value="from Product p where p.productName =:name")
	@Query(value = "select * from product p where p.product_name=:name", nativeQuery = true)
	List<Product> byName(@Param("name") String productName);

}
