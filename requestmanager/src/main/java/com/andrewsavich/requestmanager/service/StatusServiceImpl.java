package com.andrewsavich.requestmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andrewsavich.requestmanager.dao.DAO;
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
	@Transactional
	public void deleteStatus(Status status) {
		statusDAO.delete(status);
	}

	@Override
	@Transactional
	public void updateStatus(Status status) {
		statusDAO.update(status);
	}

	@Override
	@Transactional
	public Status getStatusById(int id) {
		return statusDAO.getById(id);
	}

	@Override
	@Transactional
	public Status getStatusByTitle(String title) {
		return statusDAO.getByField(title);
	}

}
