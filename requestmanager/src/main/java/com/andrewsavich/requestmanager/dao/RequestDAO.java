package com.andrewsavich.requestmanager.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.andrewsavich.requestmanager.entity.Request;

@Repository
public class RequestDAO implements DAO<Request> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<Request> allItems() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Request").list();
	}

	@Override
	public void add(Request request) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(request);
	}

	@Override
	public void delete(Request request) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(request);
	}

	@Override
	public void update(Request request) {
		Session session = sessionFactory.getCurrentSession();
		session.update(request);
	}

	@Override
	public Request getById(int id) {
		Session session = sessionFactory.getCurrentSession();
        return session.get(Request.class, id);
	}

	@Override
	public Request getByField(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
