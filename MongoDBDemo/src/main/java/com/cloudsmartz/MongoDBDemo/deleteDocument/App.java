package com.cloudsmartz.MongoDBDemo.deleteDocument;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class App {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("demodb");
		DBCollection dbCollection = db.getCollection("userdetail");

		// ---- How to remove any document from the collections------

		// DBObject dbObject = dbCollection.findOne();
		// DBCursor dbCursor = dbCollection.find();
		// while (dbCursor.hasNext()) {
		// System.out.println(dbCursor.next());
		// }
		// dbCollection.remove(dbObject);
		// dbCursor = dbCollection.find();
		// while (dbCursor.hasNext()) {
		// System.out.println(dbCursor.next());
		// }
		DBCursor dbCursor = dbCollection.find();
		while (dbCursor.hasNext()) {
			System.out.println(dbCursor.next());
		}
		System.out.println("*************************************************");
		dbCursor = dbCollection.find().skip(2);
		while (dbCursor.hasNext()) {
			System.out.println(dbCursor.next());
		}
	}
}
