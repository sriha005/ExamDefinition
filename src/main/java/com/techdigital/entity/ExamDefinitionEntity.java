package com.techdigital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exam_definition")
public class ExamDefinitionEntity {
	
	@Id
	@Column(name="examID")
	private int examID;
	@Column(name="name")
	private String name;
	@Column(name="passingScore")
	private int passingScore;
	
	public ExamDefinitionEntity() {
		super();
	}
		
	public ExamDefinitionEntity(int examID, String name, int passingScore) {
		super();
		this.examID = examID;
		this.name = name;
		this.passingScore = passingScore;
	}

	public int getExamId() {
		return examID;
	}
	public void setExamId(int examID) {
		this.examID = examID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassingScore() {
		return passingScore;
	}
	public void setPassingScore(int passingScore) {
		this.passingScore = passingScore;
	}

}
