package com.techdigital.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techdigital.entity.ExamDefinitionEntity;
import com.techdigital.entity.ResponseEntity;
import com.techdigital.repository.ExamDefinitionRepository;
import com.techdigital.repository.ResponseRepository;

@RestController
@RequestMapping(value="/response")
public class ResponseImpl {

	@Autowired
	ResponseRepository ResRepository;

	@CrossOrigin(origins = {"http://localhost:4201","https://test-6780f.firebaseapp.com"})
	@PostMapping(path="/")
	public @ResponseBody ResponseEntity addExam(@RequestBody ResponseEntity e ){
		// This returns a JSON or XML with the users
		ResRepository.save(e);
		return e;
	}
	
	@GetMapping(path="/")
	public @ResponseBody List<ResponseEntity> getExam(){
		// This returns a JSON or XML with the users
		return ResRepository.findAll();
	}
}
