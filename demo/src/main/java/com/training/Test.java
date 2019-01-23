package com.training;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.business.CustomerRepositoryImpl;
import com.training.entity.Customer;

@RestController
@RequestMapping("/test")
public class Test {
	
	@Autowired
	private CustomerRepositoryImpl customerRepositoryImpl;
	
	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String test(@RequestBody Customer customer, HttpServletRequest request) {

		Customer customer2  = customerRepositoryImpl.saveCustomer(customer);
		
		return String.valueOf(customer2.getId());
    }

}
