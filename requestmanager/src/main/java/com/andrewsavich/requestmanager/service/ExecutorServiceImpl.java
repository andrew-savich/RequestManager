package com.andrewsavich.requestmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andrewsavich.requestmanager.dao.DAO;
import com.andrewsavich.requestmanager.entity.Executor;

@Service
public class ExecutorServiceImpl implements ExecutorService {
	@Autowired
	private DAO<Executor> executorDAO;

	@Override
	@Transactional
	public List<Executor> allExecutors() {
		return executorDAO.allItems();
	}

	@Override
	@Transactional
	public void addRequest(Executor executor) {
		executorDAO.add(executor);
	}

	@Override
	@Transactional
	public void deleteRequest(Executor executor) {
		executorDAO.delete(executor);
	}

	@Override
	@Transactional
	public void updateRequest(Executor executor) {
		executorDAO.update(executor);
	}

	@Override
	@Transactional
	public Executor getRequestById(int id) {
		return executorDAO.getById(id);
	}

}
