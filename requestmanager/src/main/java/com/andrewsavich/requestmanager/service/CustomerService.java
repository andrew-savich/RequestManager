package com.andrewsavich.requestmanager.service;

import java.util.List;

import com.andrewsavich.requestmanager.entity.Customer;

public interface CustomerService {
	List<Customer> allCustomer();

	void addCustomer(Customer customer);

	void deleteCustomer(Customer customer);

	void updateCustomer(Customer customer);

	Customer getCustomerById(int id);

	Customer getCustomerByName(String name);
}
