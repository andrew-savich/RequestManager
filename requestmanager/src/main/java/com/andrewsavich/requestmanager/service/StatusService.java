package com.andrewsavich.requestmanager.service;

import java.util.List;

import com.andrewsavich.requestmanager.entity.Status;

public interface StatusService {
	List<Status> allStatuses();

	void addStatus(Status status);

	void deleteStatus(Status status);

	void updateStatus(Status status);

	Status getStatusById(int id);

	Status getStatusByTitle(String title);
}
