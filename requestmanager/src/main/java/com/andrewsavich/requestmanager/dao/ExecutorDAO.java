package com.andrewsavich.requestmanager.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.andrewsavich.requestmanager.entity.Executor;

@Repository
public class ExecutorDAO implements DAO<Executor> {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Executor> allItems() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Executor").list();
	}

	@Override
	public void add(Executor executor) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(executor);
	}

	@Override
	public void delete(Executor executor) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(executor);
	}

	@Override
	public void update(Executor executor) {
		Session session = sessionFactory.getCurrentSession();
		session.update(executor);
	}

	@Override
	public Executor getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Executor.class, id);
	}

}
