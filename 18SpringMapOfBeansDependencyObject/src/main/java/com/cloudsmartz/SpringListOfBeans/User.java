package com.cloudsmartz.SpringListOfBeans;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class User {

	private Map<Answer, Question> answers;

	public Map<Answer, Question> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Answer, Question> answers) {
		this.answers = answers;
	}

	public void display() {
		Set<Answer> set = answers.keySet();
		Iterator<Answer> itr = set.iterator();
		while (itr.hasNext()) {
			Answer answer = itr.next();
			System.out.println("Answer: >>   " + answer);
			Question q = answers.get(answer);
			System.out.println("Question: >>  " + q);
		}
	}
}
