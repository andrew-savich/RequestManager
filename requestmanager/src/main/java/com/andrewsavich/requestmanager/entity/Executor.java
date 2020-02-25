package com.andrewsavich.requestmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "executors")
public class Executor {
	@Id
	@Column(name = "executor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int executor_id;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "email")
	private String email;

	public int getExecutor_id() {
		return executor_id;
	}

	public void setExecutor_id(int executor_id) {
		this.executor_id = executor_id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
