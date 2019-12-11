package com.techdigital.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExamDefinitionDetailsDomain implements Serializable {

	private static final long serialVersionUID = -5388678298254389550L;
	private Integer qid;
	private int eid;
	private String questionText;
	private String questionOptions;
	private String questionAnswer;

	public ExamDefinitionDetailsDomain() {
		super();
	}
	
	public ExamDefinitionDetailsDomain(int eid, String questionText, String questionOptions, String questionAnswer) {
		super();
		this.eid = eid;
		this.questionText = questionText;
		this.questionOptions = questionOptions;
		this.questionAnswer = questionAnswer;
	}

	public ExamDefinitionDetailsDomain(int qid, int eid, String questionText, String questionOptions, String questionAnswer) {
		super();
		this.qid = qid;
		this.eid = eid;
		this.questionText = questionText;
		this.questionOptions = questionOptions;
		this.questionAnswer = questionAnswer;
		
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String questionOptions) {
		this.questionOptions = questionOptions;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	
}
