package com.cloudsmartz.MongoDBDemo.updateDocument;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class App {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB db = mongoClient.getDB("demodb");
		DBCollection dbCollection = db.getCollection("userdetail");
		DBCursor dbCursor = dbCollection.find();
		WriteResult dbc = null;
		while (dbCursor.hasNext()) {
			BasicDBObject updateDocument = (BasicDBObject) dbCursor.next();
			updateDocument.put("email", "arsh@gmail.com");
			BasicDBObject query = updateDocument.append("name", "Arsh");
			dbc = dbCollection.update(query, updateDocument);
		}
		System.out.println(dbc);
		dbCursor = dbCollection.find();
		while (dbCursor.hasNext()) {
			System.out.println(dbCursor.next());
		}

	}

}
