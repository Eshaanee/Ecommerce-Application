package com.Ecommerce.web.dto;



public class GetOrdersDto {
	private int orderId;
	private int user_id;
	private String shipping_address;
	private int transaction_id;
	private String cart;

	public GetOrdersDto() {
		
	}

	public GetOrdersDto(int orderId, int user_id, String shipping_address, int transaction_id, String cart) {
		this.orderId = orderId;
		this.user_id = user_id;
		this.shipping_address = shipping_address;
		this.transaction_id = transaction_id;
		this.cart = cart;
	}

	
	
	public int getorderId() {
		return orderId;
	}

	public void setorderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getShipping_address() {
		return shipping_address;
	}

	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getCart() {
		return cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

}
