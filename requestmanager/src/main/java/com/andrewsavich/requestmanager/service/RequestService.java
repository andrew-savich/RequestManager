package com.andrewsavich.requestmanager.service;

import java.util.List;

import com.andrewsavich.requestmanager.entity.Request;

public interface RequestService {
	List<Request> allRequests();

	void addRequest(Request request);

	void deleteRequest(Request request);

	void updateRequest(Request request);

	Request getRequestById(int id);
}
