package com.cloudsmartz.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "customer")
public class Customer {

	@GenericGenerator(name = "gg", strategy = "assigned")
	@GeneratedValue(generator = "gg")
	@Id
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"name\":\"" + name + "\",\"email\":\""
				+ email + "\"}";
	}
}
