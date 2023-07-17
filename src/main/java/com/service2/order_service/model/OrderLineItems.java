package com.service2.order_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_line_items")
public class OrderLineItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//è una sequenza di caratteri alfanumerici univoca che le aziende utilizzano per identificare e tracciare i propri prodotti all'interno del magazzino, giacché semplifica la localizzazione e impedisce la confusione tra articoli diversi
	private String skuCode;
	private Float price;
	private Integer quantity;
	
	public OrderLineItems() {
	}
	
	public OrderLineItems(Long id, String skuCode,Integer quantity,Float price) {
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
