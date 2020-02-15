package com.techdigital.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techdigital.entity.ExamDefinitionEntity;
import com.techdigital.repository.ExamDefinitionRepository;


@RestController
@RequestMapping(value="/examdefinition")
public class ExamDefinitionImpl {
	
	@Autowired
	ExamDefinitionRepository edRepository;

	@CrossOrigin(origins = {"http://localhost:4201","https://test-6780f.firebaseapp.com"})
	@GetMapping(path="/")
	public @ResponseBody Iterable<ExamDefinitionEntity> getAllExams() {
		// This returns a JSON or XML with the users
		return edRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public @ResponseBody ExamDefinitionEntity findById(@PathVariable("id") int Id){
		// This returns a JSON or XML with the users
		return edRepository.findOne(Id);
	}
	
	@PostMapping(path="/")
	public @ResponseBody ExamDefinitionEntity addExam(@RequestBody ExamDefinitionEntity e ){
		// This returns a JSON or XML with the users
		edRepository.saveAndFlush(e);
		return e;
	}
}
