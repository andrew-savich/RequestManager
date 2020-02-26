package com.andrewsavich.requestmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andrewsavich.requestmanager.dao.DAO;
import com.andrewsavich.requestmanager.entity.Request;

@Service
public class RequestServiceImpl implements RequestService {
	@Autowired
	private DAO<Request> requestDAO;

	@Override
	@Transactional
	public List<Request> allRequests() {
		System.out.println(requestDAO.allItems());
		return requestDAO.allItems();
	}

	@Override
	@Transactional
	public void addRequest(Request request) {
		requestDAO.add(request);
	}

	@Override
	@Transactional
	public void deleteRequest(Request request) {
		requestDAO.delete(request);
	}

	@Override
	@Transactional
	public void updateRequest(Request request) {
		requestDAO.update(request);
	}

	@Override
	@Transactional
	public Request getRequestById(int id) {
		return requestDAO.getById(id);
	}

}
