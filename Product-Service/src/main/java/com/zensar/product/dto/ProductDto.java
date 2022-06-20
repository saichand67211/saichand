package com.zensar.product.dto;

public class ProductDto {
	private int productId;
	private String productName;
	private int productCost;
	private int productWeight;
	private int productQuntity;
	private String productExpireDate;
	public ProductDto() {
		super();
	}
	public ProductDto(int productId, String productName, int productCost, int productWeight, int productQuntity,
			String productExpireDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productWeight = productWeight;
		this.productQuntity = productQuntity;
		this.productExpireDate = productExpireDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}
	public int getProductQuntity() {
		return productQuntity;
	}
	public void setProductQuntity(int productQuntity) {
		this.productQuntity = productQuntity;
	}
	public String getProductExpireDate() {
		return productExpireDate;
	}
	public void setProductExpireDate(String productExpireDate) {
		this.productExpireDate = productExpireDate;
	}
	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productWeight=" + productWeight + ", productQuntity=" + productQuntity + ", productExpireDate="
				+ productExpireDate + "]";
	}
	
}
