package com.onetoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	private int questionIid;

	private String question;

	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	private List<Answer> answers;

	public int getQuestionIid() {
		return questionIid;
	}

	public void setQuestionIid(int questionIid) {
		this.questionIid = questionIid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}	
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	public Question(int questionIid, String question, List<Answer> answers) {
		super();
		this.questionIid = questionIid;
		this.question = question;
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
