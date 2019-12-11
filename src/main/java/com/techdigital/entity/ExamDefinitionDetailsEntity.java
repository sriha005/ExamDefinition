package com.techdigital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class ExamDefinitionDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="questionID")
	private int qid;
	@Column(name="questionText")
	private String questionText;
	@Column(name="questionAnswer")
	private String questionAnswer;
	@Column(name="questionOptions")
	private String questionOptions;
	@ManyToOne
	@JoinColumn(name="examID")
	private ExamDefinitionEntity exam;
	
	public ExamDefinitionDetailsEntity() {
		super();
	}
	public ExamDefinitionDetailsEntity(String questionText, String questionAnswer, String questionOptions,
			ExamDefinitionEntity exam) {
		super();
		this.questionText = questionText;
		this.questionAnswer = questionAnswer;
		this.questionOptions = questionOptions;
		this.exam = exam;
	}
	public ExamDefinitionDetailsEntity(int qid, String questionText, String questionAnswer, String questionOptions,
			ExamDefinitionEntity exam) {
		super();
		this.qid = qid;
		this.questionText = questionText;
		this.questionAnswer = questionAnswer;
		this.questionOptions = questionOptions;
		this.exam = exam;
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
	public ExamDefinitionEntity getExam() {
		return exam;
	}
	public void setExam(ExamDefinitionEntity exam) {
		this.exam = exam;
	}


	
}
