package com.gagan.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class OffersDAO {

	private JdbcTemplate dataSource;

	@Autowired(required = false)
	public void setDataSource(DataSource jdbc) {
		dataSource = new JdbcTemplate(jdbc);
	}

	public List<Offer> getAllOffers() {
		return dataSource.query("select * from offer", new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int arg1) throws SQLException {
				Offer offer = new Offer();
				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));
				return offer;
			}

		});
	}
}
