package com.cloudsmartz.services;

import java.util.List;

import com.cloudsmartz.entities.Customer;

public interface CustomerServices {

	public List<Customer> getAllCustomers();

	public String addCustomer(Customer customer);

	public String updateCustomer(Customer customer);

	public String delCustomer(int id);

}
