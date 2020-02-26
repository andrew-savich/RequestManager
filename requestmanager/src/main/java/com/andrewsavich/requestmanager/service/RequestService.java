package com.andrewsavich.requestmanager.service;

import java.util.List;

import com.andrewsavich.requestmanager.entity.Request;
import com.andrewsavich.requestmanager.model.RequestModel;

public interface RequestService {
	List<RequestModel> allRequests();

	void addRequest(Request request);

	void deleteRequest(Request request);

	void updateRequest(Request request);

	Request getRequestById(int id);
}
