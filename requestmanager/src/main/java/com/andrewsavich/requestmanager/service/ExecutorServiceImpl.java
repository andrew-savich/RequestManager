package com.andrewsavich.requestmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andrewsavich.requestmanager.dao.DAO;
import com.andrewsavich.requestmanager.entity.Executor;

@Service
public class ExecutorServiceImpl implements ExecutorService {
	
	private DAO<Executor> executorDAO;
	
	@Autowired
	public void setExecutorDAO(DAO<Executor> executorDAO) {
		this.executorDAO = executorDAO;
	}

	

	@Override
	@Transactional
	public List<Executor> allExecutors() {
		return executorDAO.allItems();
	}

	
	@Override
	@Transactional
	public void addExecutor(Executor executor) {
		executorDAO.add(executor);
	}

	@Override
	@Transactional
	public void deleteExecutor(Executor executor) {
		executorDAO.delete(executor);
	}

	@Override
	@Transactional
	public void updateExecutor(Executor executor) {
		executorDAO.update(executor);
	}

	@Override
	@Transactional
	public Executor getExecutorById(int id) {
		return executorDAO.getById(id);
	}

	@Override
	@Transactional
	public Executor getExecutorByName(String name) {
		return executorDAO.getByField(name);
	}
	

}
