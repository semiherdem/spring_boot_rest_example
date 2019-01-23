package com.training.business;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.entity.Customer;
import com.training.repository.CustomerRepository;

@Service

public class CustomerRepositoryImpl {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Transactional
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	

}
