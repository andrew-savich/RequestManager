package com.andrewsavich.requestmanager.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.andrewsavich.requestmanager.entity.Status;

@Repository
public class StatusDAO implements DAO<Status> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<Status> allItems() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Status").list();
	}

	@Override
	public void add(Status object) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(object);

	}

	@Override
	public void delete(Status object) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(object);
	}

	@Override
	public void update(Status object) {
		Session session = sessionFactory.getCurrentSession();
		session.update(object);
	}

	@Override
	public Status getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Status.class, id);
	}

}
