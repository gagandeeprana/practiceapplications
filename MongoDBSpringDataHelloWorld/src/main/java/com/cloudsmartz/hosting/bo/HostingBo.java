package com.cloudsmartz.hosting.bo;

import com.cloudsmartz.seq.exception.SequenceException;

public interface HostingBo {

	public void save(String name) throws SequenceException;
}
