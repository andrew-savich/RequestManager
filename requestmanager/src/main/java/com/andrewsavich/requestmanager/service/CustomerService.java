package com.andrewsavich.requestmanager.service;

import java.util.List;

import com.andrewsavich.requestmanager.entity.Customer;

public interface CustomerService {
	List<Customer> allCustomer();

	void addRequest(Customer customer);

	void deleteRequest(Customer customer);

	void updateRequest(Customer customer);

	Customer getRequestById(int id);
}
