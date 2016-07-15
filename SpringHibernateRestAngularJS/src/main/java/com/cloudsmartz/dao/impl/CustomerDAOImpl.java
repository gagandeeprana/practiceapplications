package com.cloudsmartz.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cloudsmartz.dao.CustomerDAO;
import com.cloudsmartz.entities.Customer;

//@Transactional
@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Customer> getAllCustomers() {
		Criteria criteria = null;
		try {
			criteria = sessionFactory.getCurrentSession().createCriteria(
					Customer.class);
		} catch (Exception e) {
			System.out.println("getAllCustomers(): " + e);
		}
		return (List<Customer>) criteria.list();
	}

	@Override
	public String addCustomer(Customer customer) {
		try {
			sessionFactory.getCurrentSession().save(customer);
			return "\"msg\":\"Customer Added\"";
		} catch (Exception e) {
			System.out.println();
		}
		return "\"msg\":\"Failed to Add Customer\"";
	}

	@Override
	public String delCustomer(int id) {
		try {
			Customer customer = (Customer) sessionFactory.getCurrentSession()
					.get(Customer.class, id);
			sessionFactory.getCurrentSession().delete(customer);
			return "\"msg\":\"Customer Deleted\"";
		} catch (Exception e) {
			System.out.println();
		}
		return "\"msg\":\"Failed to Delete Customer\"";
	}

	@Override
	public String updateCustomer(Customer customer) {
		try {
			sessionFactory.getCurrentSession().merge(customer);
			return "\"msg\":\"Customer Updated\"";
		} catch (Exception e) {
			System.out.println();
		}
		return "";
	}
}
