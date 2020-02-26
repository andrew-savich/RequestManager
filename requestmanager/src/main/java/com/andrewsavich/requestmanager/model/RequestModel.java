package com.andrewsavich.requestmanager.model;

import com.andrewsavich.requestmanager.entity.Request;

public class RequestModel {
	private int id;
	private String title;
	private String executor;
	private String customer;
	private String status;
	public int getId() {
		return id;
	}
	public RequestModel() {
		
	}
	
	public RequestModel(Request request){
		this.id = request.getId();
		this.title = request.getTitle();
		this.executor = request.getExecutor().getFullName();
		this.customer = request.getCustomer().getFullName();
		this.status = request.getStatus().getTitle();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExecutor() {
		return executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return id + " " + title + " " + executor + " " + customer + " " + status; 
	}
	
	
}
