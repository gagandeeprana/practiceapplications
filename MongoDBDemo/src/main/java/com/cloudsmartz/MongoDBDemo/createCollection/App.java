package com.cloudsmartz.MongoDBDemo.createCollection;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class App {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost", 27017);

		DB db = mongoClient.getDB("demodb");
		System.out.println("Connected to DB");

		DBCollection dbCollection = db.createCollection("faqmaster",
				new BasicDBObject());

		System.out.println("Collection Created");
	}
}
