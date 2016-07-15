package com.cloudsmartz;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/customer")
public class CustomerAPI {

	@GET
	@Path("/getCustomers")
	@Produces("application/json")
	public String feed() {
		String feeds = null;
		try {
			List<Customer> lstCustomers = null;
			CustomerServices customerServices = new CustomerServices();
			lstCustomers = customerServices.getAllCustomers();
			Gson gson = new Gson();
			System.out.println(gson.toJson(lstCustomers));
			feeds = gson.toJson(lstCustomers);
		} catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return feeds;
	}

	@POST
	@Path("/addCustomer")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createCustomer(Customer customer) {
		System.out.println();
		String result = "";
		try {
			CustomerServices customerServices = new CustomerServices();
			result = customerServices.addCustomer(customer);
		} catch (Exception e) {
			System.out.println("Exception Error  " + e); // Console
		}
		return Response.status(200).entity(result).build();
	}

	@PUT
	@Path("/updateCustomer/id/{id}/name/{name}/email/{email}")
	public String updateCustomer(@PathParam("id") int id,
			@PathParam("name") String name, @PathParam("email") String email) {
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
		return result;
	}

	@DELETE
	@Path("/delCustomer/id/{id}")
	public String delCustomer(@PathParam("id") int id) {
		String result = "";
		try {
			CustomerServices customerServices = new CustomerServices();
			result = customerServices.delCustomer(id);
		} catch (Exception e) {
			System.out.println("Exception Error  " + e); // Console
		}
		return result;
	}
}
