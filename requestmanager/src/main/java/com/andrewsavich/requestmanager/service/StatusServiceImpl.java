package com.andrewsavich.requestmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andrewsavich.requestmanager.dao.DAO;
import com.andrewsavich.requestmanager.entity.Customer;
import com.andrewsavich.requestmanager.entity.Status;

@Service
public class StatusServiceImpl implements StatusService {
	@Autowired
	private DAO<Status> statusDAO;

	@Override
	@Transactional
	public List<Status> allStatuses() {
		return statusDAO.allItems();
	}

	@Override
	@Transactional
	public void addStatus(Status status) {
		statusDAO.add(status);
	}

	@Override
	public void deleteStatus(Status status) {
		statusDAO.delete(status);
	}

	@Override
	public void updateStatus(Status status) {
		statusDAO.update(status);
	}

	@Override
	public Status getRequestById(int id) {
		return statusDAO.getById(id);
	}

}
