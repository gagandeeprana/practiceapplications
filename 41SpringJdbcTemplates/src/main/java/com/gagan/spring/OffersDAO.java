package com.gagan.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OffersDAO {

	private JdbcTemplate dataSource;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		dataSource = new JdbcTemplate(jdbc);
	}

	public List<Offer> getAllOffers() {
		return null;
	}
}
