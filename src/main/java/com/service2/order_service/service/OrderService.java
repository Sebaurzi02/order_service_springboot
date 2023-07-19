package com.service2.order_service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.service2.order_service.dto.OrderRequest;
import com.service2.order_service.model.OrderLineItems;
import com.service2.order_service.repository.OrderRepository;
import com.service2.order_service.dto.OrderLineItemsDto;
import com.service2.order_service.model.Order;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
		OrderLineItems  orderLineItems = new OrderLineItems();
		orderLineItems.setPrice(orderLineItemsDto.getPrice());
		orderLineItems.setQuantity(orderLineItemsDto.getQuntity());
		orderLineItems.setSkucode(orderLineItemsDto.getSkucode());
		
		return orderLineItems;
	}
	
	public void placeOrder(OrderRequest orderRequest) {
		Order order = new Order();
		order.setOrdernumber(UUID.randomUUID().toString());
		
		List <OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
			.stream()
			.map(orderLineItemsDto -> mapToDto(orderLineItemsDto))
			.toList();
		
		order.setOrderlinetemlist(orderLineItems);
		orderRepository.save(order);
	}

}
