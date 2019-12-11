package com.techdigital.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "examDefinition")
public class ExamDefinitionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="examID")
	private int examID;
	@Column(name="name")
	private String name;
	@Column(name="passingScore")
	private int passingScore;
	@OneToMany(mappedBy = "exam",
				cascade = CascadeType.ALL
			)
	private List<ExamDefinitionDetailsEntity> questions = new ArrayList<ExamDefinitionDetailsEntity>();
	
	public ExamDefinitionEntity() {
		super();
	}
	public ExamDefinitionEntity(int examID, String name, int passingScore) {
		super();
		this.examID = examID;
		this.name = name;
		this.passingScore = passingScore;
	}
	public ExamDefinitionEntity(int examID, String name, int passingScore,
			List<ExamDefinitionDetailsEntity> questions) {
		super();
		this.examID = examID;
		this.name = name;
		this.passingScore = passingScore;
		this.questions = questions;
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
	public List<ExamDefinitionDetailsEntity> getQuestions() {
		return questions;
	}
	public void setQuestions(List<ExamDefinitionDetailsEntity> questions) {
		this.questions = questions;
	}

}
