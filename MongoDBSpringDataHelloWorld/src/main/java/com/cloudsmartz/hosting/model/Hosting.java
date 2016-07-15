package com.cloudsmartz.hosting.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
public class Hosting {

	private long id;

	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
