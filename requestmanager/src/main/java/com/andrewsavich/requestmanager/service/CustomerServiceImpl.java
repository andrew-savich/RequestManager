package com.andrewsavich.requestmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andrewsavich.requestmanager.dao.DAO;
import com.andrewsavich.requestmanager.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private DAO<Customer> customerDAO;

	@Override
	@Transactional
	public List<Customer> allCustomer() {
		return customerDAO.allItems();
	}

	@Override
	@Transactional
	public void addRequest(Customer customer) {
		customerDAO.add(customer);
	}

	@Override
	@Transactional
	public void deleteRequest(Customer customer) {
		customerDAO.delete(customer);
	}

	@Override
	@Transactional
	public void updateRequest(Customer customer) {
		customerDAO.update(customer);
	}

	@Override
	@Transactional
	public Customer getRequestById(int id) {
		return customerDAO.getById(id);
	}

}
