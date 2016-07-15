package com.cloudsmartz.seq.dao;

import com.cloudsmartz.seq.exception.SequenceException;

public interface SequenceDao {

	long getNextSequenceId(String key) throws SequenceException;
}
