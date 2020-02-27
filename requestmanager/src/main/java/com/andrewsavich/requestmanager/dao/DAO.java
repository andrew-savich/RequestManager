package com.andrewsavich.requestmanager.dao;

import java.util.List;


public interface DAO<T> {
	List<T> allItems();

	void add(T object);

	void delete(T object);

	void update(T object);

	T getById(int id);
	
	T getByField(String field);

}
