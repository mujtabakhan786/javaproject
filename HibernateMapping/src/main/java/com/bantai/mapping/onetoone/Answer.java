package com.bantai.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
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

	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + "]";
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

}