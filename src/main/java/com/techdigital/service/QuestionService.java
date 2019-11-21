package com.techdigital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdigital.entity.QuestionEntity;
import com.techdigital.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;
	 public List<QuestionEntity> getAllQuestions() {
		 List<QuestionEntity> questionList = questionRepository.findAll();
		return questionList;
	 }
	
}
