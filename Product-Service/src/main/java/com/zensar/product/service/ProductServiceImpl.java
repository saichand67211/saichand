package com.zensar.product.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
		//List<Product> findbyProductName = productRepository.findByProductName(productName);
				List<Product> findbyProductName = productRepository.byName(productName);
				List<ProductDto> productDtos = new ArrayList<ProductDto>();
				for (Product product : findbyProductName)
					productDtos.add(modelMapper.map(product, ProductDto.class));
				return productDtos;
	
	}


	@Override
	public List<ProductDto> getByProductNameAndProductPrice(String productName, int productCost) {
		List<Product> products = productRepository.findByProductNameAndProductCost(productName, productCost);
		List<ProductDto> productDtos = new ArrayList<ProductDto>();
		for (Product product : products)
			productDtos.add(modelMapper.map(product, ProductDto.class));
		return productDtos;
	}

	@Override
	public List<ProductDto> getByProductNameOrderByProductQuantity(String productName) {
		List<Product> findbyProductName = productRepository.findByProductNameOrderByProductQuantity(productName);
		List<ProductDto> productDtos = new ArrayList<ProductDto>();
		for (Product product : findbyProductName)
			productDtos.add(modelMapper.map(product, ProductDto.class));
		return productDtos;
	}

}

