package com.cloudsmartz;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class CustomerAPI {

	@RequestMapping(value = "/getCustomers", method = RequestMethod.GET, produces = "application/json")
	public String feed() {
		String feeds = null;
		try {
			List<Customer> lstCustomers = null;
			CustomerServices customerServices = new CustomerServices();
			lstCustomers = customerServices.getAllCustomers();
			Gson gson = new Gson();
			feeds = gson.toJson(lstCustomers);
		} catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return feeds;
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public ResponseEntity createCustomer(@RequestBody Customer obj) {
		String result = "";
		try {
			CustomerServices customerServices = new CustomerServices();
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
			CustomerServices customerServices = new CustomerServices();
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
		if (id > 0) {
			String result = "";
			System.out.println("Id:: " + id);
			try {
				CustomerServices customerServices = new CustomerServices();
				result = customerServices.delCustomer(id);
			} catch (Exception e) {
				System.out.println("Exception Error  " + e); // Console
			}
			return new ResponseEntity<String>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
