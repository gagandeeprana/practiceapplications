package com.cloudsmartz.hosting.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudsmartz.hosting.dao.HostingDao;
import com.cloudsmartz.hosting.model.Hosting;
import com.cloudsmartz.seq.dao.SequenceDao;
import com.cloudsmartz.seq.exception.SequenceException;

@Service
public class HostingBoImpl implements HostingBo {

	private static final String HOSTING_SEQ_KEY = "hosting";

	@Autowired
	private SequenceDao sequenceDao;

	@Autowired
	private HostingDao hostingDao;

	public void save(String name) throws SequenceException {
		Hosting hosting = new Hosting();
		hosting.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
		hosting.setName(name);
		hostingDao.save(hosting);
		System.out.println(hosting);
	}
}
