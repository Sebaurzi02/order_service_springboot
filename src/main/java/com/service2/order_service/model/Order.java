package com.service2.order_service.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String OrderNumber;
	@OneToMany(cascade = CascadeType.ALL)
	private List<OrderLineItems> orderLineItemList;
	
	public Order() {
	}
	
	public Order(Long id, String OrderNumber, List<OrderLineItems> orderLineItemList) {
		this.id = id;
		this.orderLineItemList = orderLineItemList;
		this.OrderNumber = OrderNumber;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setOrdernumber(String OrderNumber) {
		this.OrderNumber = OrderNumber;
	}
	
	public void setOrderlinetemlist(List<OrderLineItems> orderLineItemList) {
		this.orderLineItemList = orderLineItemList;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getOrdernumber() {
		return this.OrderNumber;
	}
	
	public List<OrderLineItems> getOrderlineitemlist(){
		return this.orderLineItemList;
	}
	

}
