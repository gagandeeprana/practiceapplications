package com.cloudsmartz.MongoDBDemo.fetchingCollection;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class App {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost", 27017);

		DB db = mongoClient.getDB("demodb");

		DBCollection dbCollection = db.getCollection("userdetail");
		System.out.println(dbCollection);

		DBCursor dbCursor = dbCollection.find();

		while (dbCursor.hasNext()) {
			System.out.println(dbCursor.next());
		}

	}
}
