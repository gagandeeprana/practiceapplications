package com.cloudsmartz.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudsmartz.dao.CustomerDAO;
import com.cloudsmartz.entities.Customer;
import com.cloudsmartz.services.CustomerServices;

@Transactional
@Service("customerServices")
public class CustomerServicesImpl implements CustomerServices {

	@Autowired
	private CustomerDAO customerDAO;

	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

	@Override
	public String addCustomer(Customer customer) {
		return customerDAO.addCustomer(customer);
	}

	@Override
	public String updateCustomer(Customer customer) {
		return customerDAO.updateCustomer(customer);

	}

	@Override
	public String delCustomer(int id) {
		return customerDAO.delCustomer(id);
	}

}
