/**
 * 
 */
package com.bantai.mapping.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Mujtaba khan
 *
 */
@Entity
public class Question1 {
	@Id
	private int qId;
	private String qName;
	@OneToMany(mappedBy = "answer")
	private List<Answer1> answer;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public List<Answer1> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}

	public Question1(int qId, String qName, List<Answer1> answer) {
		super();
		this.qId = qId;
		this.qName = qName;
		this.answer = answer;
	}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", qName=" + qName + ", answer=" + answer + "]";
	}

}
