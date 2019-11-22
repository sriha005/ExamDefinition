package com.techdigital.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.techdigital.domain.ExamDefinitionDetailsDomain;

@RestController
@RequestMapping(path="/examdefinitiondetails/api")
public interface ExamDefinitionDetailsService {
	
	@GetMapping(path="/q/{id}")
	public @ResponseBody Iterable<ExamDefinitionDetailsDomain> getQuestions(@PathVariable("id") Integer id);
	
	@GetMapping(path="/a{id}")
	public @ResponseBody Iterable<ExamDefinitionDetailsDomain> getAnswers(@PathVariable("id") Integer id);
	
	@PostMapping(path="/")
	public @ResponseBody String createQuestion (@RequestBody ExamDefinitionDetailsDomain e);
	
}
