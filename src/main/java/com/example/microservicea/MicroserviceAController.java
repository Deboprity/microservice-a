package com.example.microservicea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceAController {
	
	@Autowired
	private MicroserviceAService microserviceAService;
	
	@RequestMapping("/api/v1/getCustomers")
	public List<Customer> getCustomers() {
		return microserviceAService.getAllCustomers();
	}

	@RequestMapping(method=RequestMethod.POST, value="/api/v1/modifyCustomer")
	public boolean modifyCustomer(@RequestBody Customer customer) {
		return microserviceAService.modifyCustomer(customer);
	}
}
