package com.service2.order_service.dto;

import java.util.List;

public class OrderLineItemsDto {
	private Long id;
	private String skuCode;
	private Float price;
	private Integer quantity;
	
	public OrderLineItemsDto() {
		
	}
	public OrderLineItemsDto(Long id, String skuCode,Integer quantity,Float price) {
		this.id = id;
		this.skuCode = skuCode;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public void setSkucode(String skuCode) {
		this.skuCode = skuCode;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getSkucode() {
		return this.skuCode;
	}

	public Integer getQuntity() {
		return this.quantity;
	}
	public Float getPrice() {
		return this.price;
	}


}
