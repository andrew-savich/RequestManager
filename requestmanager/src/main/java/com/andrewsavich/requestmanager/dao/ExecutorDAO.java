package com.andrewsavich.requestmanager.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.andrewsavich.requestmanager.entity.Executor;

@Repository
public class ExecutorDAO implements DAO<Executor> {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	@SuppressWarnings("unchecked")
	public List<Executor> allItems() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Executor").list();
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


	@Override
	public Executor getByField(String name) {
		Session session = sessionFactory.getCurrentSession();
		return (Executor) session.createQuery("FROM Executor WHERE fullName = :name").setParameter("name", name).uniqueResult();
	}

}
