package com.andrewsavich.requestmanager.service;

import java.util.List;

import com.andrewsavich.requestmanager.entity.Executor;

public interface ExecutorService {
	List<Executor> allExecutors();

	void addExecutor(Executor executor);

	void deleteExecutor(Executor executor);

	void updateExecutor(Executor executor);

	Executor getExecutorById(int id);
	
	Executor getExecutorByName(String name);
}
