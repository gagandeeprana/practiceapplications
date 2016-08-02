package com.gagan.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		OffersDAO offersDAO = context.getBean(OffersDAO.class);
		List<Offer> lstOffers = offersDAO.getAllOffers();
		for (Offer offer : lstOffers) {
			System.out.println(offer.getName() + " " + offer.getEmail());
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
