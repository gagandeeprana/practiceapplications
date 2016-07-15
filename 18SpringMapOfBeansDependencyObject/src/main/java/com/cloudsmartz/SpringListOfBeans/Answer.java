package com.cloudsmartz.SpringListOfBeans;

public class Answer {

	private int answerId;
	private String answer;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + "]";
	}

}
