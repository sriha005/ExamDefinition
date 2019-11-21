package com.techdigital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class QuestionEntity {
	
	@Id
	@Column(name="questionID")
	private int qid;
	@Column(name="questionText")
	private String questionText;
	@Column(name="questionAnswer")
	private String questionAnswer;
	@Column(name="questionOptions")
	private String questionOptions;
	
	public QuestionEntity() {
		super();
	}
	public QuestionEntity(int qid, String questionText, String questionAnswer, String questionOptions) {
		super();
		this.qid = qid;
		this.questionText = questionText;
		this.questionAnswer = questionAnswer;
		this.questionOptions = questionOptions;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public String getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String questionOptions) {
		this.questionOptions = questionOptions;
	}
	
}
