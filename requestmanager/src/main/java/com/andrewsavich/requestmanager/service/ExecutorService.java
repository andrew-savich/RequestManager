package com.andrewsavich.requestmanager.service;

import java.util.List;

import com.andrewsavich.requestmanager.entity.Executor;

public interface ExecutorService {
	List<Executor> allExecutors();

	void addRequest(Executor executor);

	void deleteRequest(Executor executor);

	void updateRequest(Executor executor);

	Executor getRequestById(int id);
}
