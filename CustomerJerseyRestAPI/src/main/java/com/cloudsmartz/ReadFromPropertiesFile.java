package com.cloudsmartz;

import java.io.InputStream;
import java.util.Properties;

public class ReadFromPropertiesFile {

	Properties properties = null;

	ReadFromPropertiesFile() {
		try {
			InputStream is = ReadFromPropertiesFile.class.getClassLoader()
					.getResourceAsStream("configuration.properties");
			properties = new Properties();
			properties.load(is);
		} catch (Exception e) {
			System.out.println("aaaa " + e);
		}
	}

	public String getURL() {
		try {
			return properties.getProperty("jdbc.url");
		} catch (Exception e) {
			System.out.println("getURL:" + e);
		}
		return "";
	}

}
