package com.techdigital.service;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdigital.domain.ExamAnswerDomain;
import com.techdigital.domain.ExamDefinitionDetailsDomain;
import com.techdigital.domain.ExamQuestionDomain;

@RestController
@RequestMapping(value="/examdefinitiondetails/api")
public interface ExamDefinitionDetailsService {
	
	@GetMapping(value = "/q/{id}")
	List<ExamQuestionDomain> getQuestions(@PathVariable("id") Integer id);
	
	@GetMapping(value = "/a/{id}")
	List<ExamAnswerDomain> getAnswers(@PathVariable("id") Integer id);
	
	@PostMapping(value = "/c")
	ExamDefinitionDetailsDomain createQuestion(@RequestBody ExamDefinitionDetailsDomain domain);
	
	@PutMapping(value = "/p/{id}")
	ExamDefinitionDetailsDomain updateQuestion(@PathVariable("id") Integer id, @RequestBody ExamDefinitionDetailsDomain domain);
	
	@DeleteMapping(value = "/d/{id}")
	void deleteQuestion(@PathVariable("id") int id);
	
}
