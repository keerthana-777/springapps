package com.springapps.springcore.lifecycle.annotations;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;


public class Patient {
	private int id;

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("inside setid method...");
	}

	// destroy method
	@PreDestroy
	public void bye() {
		System.out.println("inside bye method...");

	}

	// init method
	@PostConstruct
	public void hi() {
		System.out.println("inside hi method...");

	}
}
