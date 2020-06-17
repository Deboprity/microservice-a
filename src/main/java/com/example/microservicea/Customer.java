package com.example.microservicea;

public class Customer {
	
	private long customerId;
	private boolean isCorporate;
	
	public Customer() {}
	
	public Customer(long customerId, boolean isCorporate) {
		super();
		this.customerId = customerId;
		this.isCorporate = isCorporate;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public boolean isCorporate() {
		return isCorporate;
	}

	public void setCorporate(boolean isCorporate) {
		this.isCorporate = isCorporate;
	}
	
	

}
