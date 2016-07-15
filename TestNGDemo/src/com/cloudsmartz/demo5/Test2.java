package com.cloudsmartz.demo5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	String message = "Manisha";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(enabled = false)
	public void SalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Manisha";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
}