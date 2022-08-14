package com.weshopify.core.customized.springbeanlifecyclewithanotations;

import org.springframework.stereotype.Component;


public class Order {

	private int orderId;
	private Product product;
	private String orderType;
	
	public Order() {System.out.println("Order is created !!");}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
