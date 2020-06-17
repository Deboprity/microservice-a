package com.example.microservicea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MicroserviceAService {
	
	private List<Customer> customers = new ArrayList<> (Arrays.asList(
			new Customer(11223344, true),
			new Customer(44332211, false),
			new Customer(12341234, true)));

	public List<Customer> getAllCustomers() {
		return customers;
	}
	
	public boolean modifyCustomer(Customer customer) {
		return false;
		//need to write the logic
	}
}
