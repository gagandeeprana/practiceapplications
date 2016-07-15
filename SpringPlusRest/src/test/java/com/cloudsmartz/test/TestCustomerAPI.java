package com.cloudsmartz.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cloudsmartz.Customer;
import com.cloudsmartz.CustomerAPI;

public class TestCustomerAPI {

	private CustomerAPI customerAPI;

	@BeforeMethod
	public void init() {
		customerAPI = new CustomerAPI();
	}

	@Test(enabled = false)
	public void testCreateCustomer() {
		Customer obj = new Customer();
		obj.setId(4);
		obj.setName("AAA");
		obj.setEmail("abc");
		ResponseEntity r = customerAPI.createCustomer(obj);
		Assert.assertEquals(new ResponseEntity(HttpStatus.CREATED), r);
	}

	@Test(enabled = false)
	public void testFeeds() {
		String str = customerAPI.feed();
		System.out.println(str);
		Assert.assertEquals(str.contains("id"), true);
	}

	@Test(enabled = false)
	public void updateCustomer() {
		ResponseEntity r = customerAPI.updateCustomer(1, "SSS", "ddsd");
		Assert.assertEquals(new ResponseEntity(HttpStatus.CREATED), r);
	}

	// @DataProvider(name = "test1")
	// public static Object[][] customerIds() {
	// return new Object[][] {{ 1, 0, 4, -1 }};
	// }

	@Test
	@Parameters("custId")
	public void delCustomer(Integer customerId) {
		Assert.assertEquals(new ResponseEntity(HttpStatus.CREATED),
				customerAPI.delCustomer(customerId));
	}

}
