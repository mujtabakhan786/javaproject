/**
 * 
 */
package com.bantai.mapping.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Mujtaba khan
 *
 */
@Entity
public class Answer1 {
	@Id
	private int ansId;
	private String answer;
	@ManyToOne
	private Question1 question;

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question1 getQuestion() {
		return question;
	}

	public void setQuestion(Question1 question) {
		this.question = question;
	}

	public Answer1(int ansId, String answer, Question1 question) {
		super();
		this.ansId = ansId;
		this.answer = answer;
		this.question = question;
	}

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", answer=" + answer + ", question=" + question + "]";
	}

}
