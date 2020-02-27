package com.andrewsavich.requestmanager.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.andrewsavich.requestmanager.entity.Customer;

@Repository
public class CustomerDAO implements DAO<Customer> {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Customer> allItems() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Customer").list();
	}

	@Override
	public void add(Customer object) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(object);
	}

	@Override
	public void delete(Customer object) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(object);
	}

	@Override
	public void update(Customer object) {
		Session session = sessionFactory.getCurrentSession();
		session.update(object);
	}

	@Override
	public Customer getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
	}

	@Override
	public Customer getByField(String name) {
		Session session = sessionFactory.getCurrentSession();
		return (Customer) session.createQuery("FROM Customer WHERE fullName = :name").setParameter("name", name).uniqueResult();
	}

}
