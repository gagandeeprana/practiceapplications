package com.cloudsmartz.seq.exception;

public class SequenceException extends RuntimeException {

	private String errCode;

	private String errMsg;

	public SequenceException(String errMsg) {
		this.errMsg = errMsg;
	}

	@Override
	public String toString() {
		return errMsg;
	}
}
