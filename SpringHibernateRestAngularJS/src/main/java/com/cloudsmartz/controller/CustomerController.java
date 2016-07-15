package com.cloudsmartz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsmartz.entities.Customer;
import com.cloudsmartz.services.CustomerServices;
import com.google.gson.Gson;

@RestController
public class CustomerController {

	@Autowired
	private CustomerServices customerServices;

	@RequestMapping(value = "/getAllCustomers", produces = "application/json", method = RequestMethod.GET)
	public String getAllCustomers() {
		String customers = "";
		try {
			List<Customer> lst = customerServices.getAllCustomers();
			Gson gson = new Gson();
			customers = gson.toJson(lst);
		} catch (Exception e) {
			System.out.println("getAllCustomers():Controller: " + e);
		}
		return customers;
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity createCustomer(@RequestBody Customer obj) {
		String result = "";
		try {
			result = customerServices.addCustomer(obj);
		} catch (Exception e) {
			System.out.println("Exception Error  " + e); // Console
		}
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/updateCustomer/id/{id}/name/{name}/email/{email}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateCustomer(@PathVariable("id") int id,
			@PathVariable("name") String name,
			@PathVariable("email") String email) {
		String result = "";
		try {
			Customer obj = new Customer();
			obj.setId(id);
			obj.setName(name);
			obj.setEmail(email);
			result = customerServices.updateCustomer(obj);
		} catch (Exception e) {
			System.out.println("Exception Error  " + e); // Console
		}
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/delCustomer/id/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> delCustomer(@PathVariable("id") Integer id) {
		String result = "";
		System.out.println("Id:: " + id);
		try {
			result = customerServices.delCustomer(id);
		} catch (Exception e) {
			System.out.println("Exception Error  " + e); // Console
		}
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

}
