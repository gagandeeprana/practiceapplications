package com.cloudsmartz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerServices {

	public List<Customer> getAllCustomers() {
		List<Customer> lst = new ArrayList();
		try {
			Connection conn = ConnectDB.connect();
			PreparedStatement pstmt = conn
					.prepareStatement("select * from customer");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Customer obj = new Customer();
				obj.setId(rs.getInt("id"));
				obj.setName(rs.getString("name"));
				obj.setEmail(rs.getString("email"));
				lst.add(obj);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return lst;
	}

	public String addCustomer(Customer obj) {
		try {
			Connection conn = ConnectDB.connect();
			PreparedStatement pstmt = conn
					.prepareStatement("insert into customer values(?,?,?)");
			pstmt.setInt(1, obj.getId());
			pstmt.setString(2, obj.getName());
			pstmt.setString(3, obj.getEmail());
			int i = pstmt.executeUpdate();
			if (i > 0) {
				return "{\"msg\":\"Customer Created\"}";
			}
		} catch (Exception e) {
			System.out.println("addCustomer: " + e);
		}
		return "{\"msg\":\"Failed to  Create Customer\"}";
	}

	public String updateCustomer(Customer obj) {
		try {
			Connection conn = ConnectDB.connect();
			PreparedStatement pstmt = conn
					.prepareStatement("update customer set name=?,email = ? where id = ?");
			pstmt.setString(1, obj.getName());
			pstmt.setString(2, obj.getEmail());
			pstmt.setInt(3, obj.getId());
			int i = pstmt.executeUpdate();
			if (i > 0) {
				return "{\"msg\":\"Customer Updated\"}";
			}
		} catch (Exception e) {
			System.out.println("updateCustomer: " + e);
		}
		return "Failed to  Update Customer";
	}

	public String delCustomer(int id) {
		try {
			Connection conn = ConnectDB.connect();
			PreparedStatement pstmt = conn
					.prepareStatement("delete from customer where id = ?");
			pstmt.setInt(1, id);
			int i = pstmt.executeUpdate();
			if (i > 0) {
				return "{\"msg\":\"Customer Deleted\"}";
			}
		} catch (Exception e) {
			System.out.println("delCustomer: " + e);
		}
		return "Failed to  Delete Customer";
	}
}
