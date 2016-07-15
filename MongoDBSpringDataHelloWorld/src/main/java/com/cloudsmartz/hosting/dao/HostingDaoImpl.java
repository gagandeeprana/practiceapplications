package com.cloudsmartz.hosting.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.cloudsmartz.hosting.model.Hosting;

@Service
public class HostingDaoImpl implements HostingDao {

	@Autowired
	private MongoOperations mongoOperations;

//	public HostingDaoImpl() {
//	}

	public void save(Hosting hosting) {
		mongoOperations.save(hosting);
	}

}
