package com.gagan.spring;

import java.util.ArrayList;
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

			// boolean flag = offersDAO.createOffer((Offer) context
			// .getBean("offer"));
			// System.out.println("Value: " + flag);

			// Offer offerForUpdate = new Offer(1, "gag", "aq1", "Done...");
			// boolean flag = offersDAO.updateOffer(offerForUpdate);
			// System.out.println("Value: " + flag);
			List<Offer> offersAdd = new ArrayList<Offer>();
			offersAdd.add(new Offer(4, "New1", "new email1", "New Text1.."));
			offersAdd.add(new Offer(2, "New2", "new email2", "New Text2.."));
//			offersAdd.add(new Offer("New3", "new email3", "New Text3.."));
//			offersAdd.add(new Offer("New4", "new email4", "New Text4.."));
			offersDAO.create(offersAdd);
			List<Offer> lstOffers = offersDAO.getAllOffers();
			for (Offer offer : lstOffers) {
				System.out.println(offer.getName() + " " + offer.getEmail());
			}
		} catch (CannotGetJdbcConnectionException e) {
			System.out.println("Cannot GET: " + e);
		} catch (DataAccessException e) {
			System.out.println("App: " + e);
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}
