package com.techdigital.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExamAnswerDomain implements Serializable {
	
	private static final long serialVersionUID = -6950262354109649727L;
	private int qid;
	private int eid;
	private String questionAnswer;
	
	public ExamAnswerDomain() {
		super();
	}
	public ExamAnswerDomain(int qid, int eid, String questionAnswer) {
		super();
		this.qid = qid;
		this.eid = eid;
		this.questionAnswer = questionAnswer;
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
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	
}
