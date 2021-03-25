package com.Ecommerce.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Orders {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="orderId")
	private int orderId;
    
	 @Column(name="userId")
    private int userId;
	
	 @Column(name="transactionId") 
    private int transactionId;
    
	 @Column(name="shippingAddress") 
    private String shippingAddress;
    
	@Column(name="cart") 
    private String cart;

	
	public Orders(int orderId, int userId, int transactionId, String shippingAddress, String cart) {
		this.orderId = orderId;
		this.userId = userId;
		this.transactionId = transactionId;
		this.shippingAddress = shippingAddress;
		this.cart = cart;
	}
	
	public Orders() {
		
	}
	
	@javax.persistence.Id
	public int getOrderId() {
		return orderId;
	}

	

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getCart() {
		return cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

    
}