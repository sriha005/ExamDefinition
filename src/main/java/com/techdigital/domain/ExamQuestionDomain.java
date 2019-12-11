package com.techdigital.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExamQuestionDomain implements Serializable{

	private static final long serialVersionUID = -8136659735007153043L;
	private int qid;
	private int eid;
	private String questionText;
	private String questionOptions;
	
	public ExamQuestionDomain() {
		super();
	}
	public ExamQuestionDomain(int qid, int eid, String questionText, String questionOptions) {
		super();
		this.qid = qid;
		this.eid = eid;
		this.questionText = questionText;
		this.questionOptions = questionOptions;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
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
}
