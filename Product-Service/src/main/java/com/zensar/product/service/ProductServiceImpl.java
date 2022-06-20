package com.zensar.product.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zensar.product.dto.ProductDto;
import com.zensar.product.entity.Product;
import com.zensar.product.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductDto getProduct(int productId) {
		Product product = productRepository.findById(productId).get();
		return modelMapper.map(product, ProductDto.class);
		
	}

	@Override
	public List<ProductDto> getAllProducts(int pageNumber, int pageSize, String sortBy, Direction ord) {
		// TODO Auto-generated method stub
		//List<Product> findAll = productRepository.findAll();
				//Page<Product> findAll = productRepository.findAll(PageRequest.of(pageNumber,pageSize,Sort.by(Direction.DESC,"productName")));
				Page<Product> findAll = productRepository.findAll(PageRequest.of(pageNumber,pageSize,Sort.by(ord,sortBy)));
				List<Product> content = findAll.getContent();
				List<ProductDto> dto = new ArrayList<ProductDto>();
				for (Product product : content)
					dto.add(modelMapper.map(product, ProductDto.class));
				return dto;
	
	}

	@Override
	public ProductDto insert(ProductDto productDto) {
		productRepository.save(modelMapper.map(productDto, Product.class));
		return productDto;
	}
	
	@Override
	public void update(int productId, ProductDto productDto) {
		// TODO Auto-generated method stub
		productRepository.save(modelMapper.map(productDto, Product.class));
		
	}
	@Override
	public void delete(int productId) {
		productRepository.deleteById(productId);
	}


	@Override
	public List<ProductDto> getByProductName(String productName) {
		// TODO Auto-generated method stub
		return productRepository.findByProductName(productName);
				
	}
	

	@Override
	public ResponseEntity<List<ProductDto>> getByProductNameAndProductCost(String productName, int productCost) {
		ResponseEntity<List<ProductDto>> products = productRepository.getByProductNameAndProductCost(productName, productCost);
		
		return products;
	}

	@Override
	public List<ProductDto> getByProductNameOrderByProductQuntity(String productName) {
		List<Product> findbyProductName = productRepository.findByProductNameOrderByProductQuntity(productName);
		List<ProductDto> listofAll = new ArrayList<ProductDto>();
		for (Product product : findbyProductName)
			listofAll.add(modelMapper.map(product, ProductDto.class));
		return listofAll;
	}

}

