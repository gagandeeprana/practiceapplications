package com.cloudsmartz.MongoDBDemo.insertDocument;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class App {

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("demodb");
		DBCollection dbCollection = db.getCollection("userdetail");
		BasicDBObject basicDBObject = new BasicDBObject("name", "Rana").append(
				"email", "xxx@gmail.com").append("count", "4");
		dbCollection.insert(basicDBObject);
	}
}
