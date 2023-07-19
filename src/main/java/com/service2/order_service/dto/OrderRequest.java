package com.service2.order_service.dto;

import java.util.List;

public class OrderRequest {
	private List<OrderLineItemsDto> orderLineItemsDtoList;
	
	public OrderRequest() {
		
	}

	public OrderRequest(List<OrderLineItemsDto> orderLineItemsDtoList) {
		this.orderLineItemsDtoList = orderLineItemsDtoList;
	}
	
	public List<OrderLineItemsDto> getOrderLineItemsDtoList(){
		return this.orderLineItemsDtoList;
	}

}
