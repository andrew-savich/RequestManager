package com.andrewsavich.requestmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andrewsavich.requestmanager.dao.DAO;
import com.andrewsavich.requestmanager.entity.Request;
import com.andrewsavich.requestmanager.model.RequestModel;

@Service
public class RequestServiceImpl implements RequestService {
	@Autowired
	private DAO<Request> requestDAO;
	
	
	@Override
	@Transactional
	public List<RequestModel> allRequests() {
		List<RequestModel> requestModels = new ArrayList<>();
		for(Request request : requestDAO.allItems()) {
			requestModels.add(new RequestModel(request));
		}
		return requestModels;
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
