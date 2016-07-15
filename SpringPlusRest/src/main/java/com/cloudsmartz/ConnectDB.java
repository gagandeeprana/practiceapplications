package com.cloudsmartz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class ConnectDB {

	static ReadFromPropertiesFile obj = new ReadFromPropertiesFile();

	public static Connection connect() {

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(obj.getURL(), "root", "");
		} catch (Exception e) {
			Logger.getLogger(ConnectDB.class + "");
		}
		return conn;
	}
}
