package com.cloudsmartz;

//@Controller
//public class CustomerController {
//
//	@RequestMapping(value = "/getCustomers", headers = { "application/json" }, method = RequestMethod.GET)
//	@ResponseBody
//	public String feed() {
//		String feeds = null;
//		try {
//			List<Customer> lstCustomers = null;
//			CustomerServices customerServices = new CustomerServices();
//			lstCustomers = customerServices.getAllCustomers();
//			Gson gson = new Gson();
//			System.out.println(gson.toJson(lstCustomers));
//			feeds = gson.toJson(lstCustomers);
//		} catch (Exception e) {
//			System.out.println("Exception Error"); // Console
//		}
//		return feeds;
//	}
// }
