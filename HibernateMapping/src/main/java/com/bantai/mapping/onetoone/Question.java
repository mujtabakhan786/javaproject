/**
 * 
 */
package com.bantai.mapping.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Mujtaba khan
 *
 */
@Entity
public class Question {
	@Id
	private int qid;
	private String qname;
	// Unidirectional
	@OneToOne
	@JoinColumn(name = "jaanu")
	private Answer answer;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int qid, String qname, Answer answer) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", answer=" + answer + "]";
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
