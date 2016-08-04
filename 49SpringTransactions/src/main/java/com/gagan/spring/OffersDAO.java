package com.gagan.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component(value = "offersDAO")
public class OffersDAO {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	// It fetches all offers
	public List<Offer> getAllOffers() {

		return jdbc.query("select * from offers", new RowMapper<Offer>() {

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

	// It fetches a single offer according to the id
	public Offer getOfferById(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		return jdbc.queryForObject("select * from offers where id = :id",
				params, new RowMapper<Offer>() {

					public Offer mapRow(ResultSet rs, int arg1)
							throws SQLException {
						Offer offer = new Offer();
						offer.setId(rs.getInt("id"));
						offer.setName(rs.getString("name"));
						offer.setEmail(rs.getString("email"));
						offer.setText(rs.getString("text"));
						return offer;
					}

				});
	}

	// It deletes a single offer using update() method..
	public boolean delete(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource("id", 2);
		return jdbc.update("delete from offers where id = :id", params) == 1;

	}

	// It creates a single offer using update() method..
	public boolean createOffer(Offer offer) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(
				offer);
		return jdbc
				.update("insert into offers (name,email,text) values(:name,:email,:text)",
						params) == 1;
	}

	// It creates a list of offers using batchUpdate() method..
	@Transactional
	public int[] create(List<Offer> offers) {
		SqlParameterSource[] params = SqlParameterSourceUtils
				.createBatch(offers.toArray());
		return jdbc
				.batchUpdate(
						"insert into offers (id,name,email,text) values(:id,:name,:email,:text)",
						params);
	}

	// It updates single offer using update() method..
	public boolean updateOffer(Offer offer) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(
				offer);
		return jdbc
				.update("update offers set name=:name,email=:email,text=:text where id=:id",
						params) == 1;
	}

}
