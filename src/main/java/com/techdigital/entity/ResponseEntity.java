package com.techdigital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "response")
public class ResponseEntity {

	@Column(name="responseid")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int responseID;
	
	
	@Column(name = "userexamid")
	int userExamID;
	
	@Column(name = "questionid")
	int questionID;
	
	@Column(name = "userresponse")
	String userResponse;
	
	@Column(name = "correct")
	boolean correct;
	
	public ResponseEntity() {
		super();
	}
	
	public ResponseEntity(int userExamID, int questionID, String userResponse, boolean correct) {
		super();
		this.userExamID = userExamID;
		this.questionID = questionID;
		this.userResponse = userResponse;
		this.correct = correct;
	}
	
	public int getResponseID() {
		return responseID;
	}

	public void setResponseID(int responseID) {
		this.responseID = responseID;
	}
	
	public int getUserExamID() {
		return userExamID;
	}
	public void setUserExamID(int userExamID) {
		this.userExamID = userExamID;
	}
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getUserResponse() {
		return userResponse;
	}
	public void setUserResponse(String userResponse) {
		this.userResponse = userResponse;
	}
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
}
