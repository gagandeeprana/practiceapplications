package com.gagan.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		OffersDAO offersDAO = (OffersDAO) context.getBean("offersDAO");
		try {
			List<Offer> lstOffers = offersDAO.getAllOffers();
			for (Offer offer : lstOffers) {
				System.out.println(offer.getName() + " " + offer.getEmail());
			}

			Offer offer = offersDAO.getOfferById(2);
			System.out.println("Offer for Id 2 is: " + offer.getId() + "  "
					+ offer.getName() + " " + offer.getEmail());
			System.out.println("====================================");
			boolean flag = offersDAO.delete(2);
			System.out.println("Value: " + flag);
		} catch (CannotGetJdbcConnectionException e) {
			System.out.println("Cannot GET: " + e);
		} catch (DataAccessException e) {
			System.out.println("App: " + e);
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
