package com.cloudsmartz.MongoDBDemo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// connect to mongodb server
		MongoClient mongoClient = new MongoClient("localhost", 27017);

		// connect to your database
		DB db = mongoClient.getDB("demodb");

		System.out.println("Connected to DB successfully");
	}
}
