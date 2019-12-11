package com.techdigital.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.techdigital.entity.ExamDefinitionDetailsEntity;
import com.techdigital.impl.transformer.EddTransformer;
import com.techdigital.repository.ExamDefinitionDetailsRepository;
import com.techdigital.repository.ExamDefinitionRepository;
import com.techdigital.service.ExamDefinitionDetailsService;

@RestController
@RequestMapping(value = "/examdefinitiondetails/api")
public class ExamDefinitonDetailsImpl implements ExamDefinitionDetailsService{
	
	@Autowired
	ExamDefinitionDetailsRepository eddRepository;
	@Autowired
	ExamDefinitionRepository edRepository;
	@Autowired
	EddTransformer eddTransformer;
//	@Autowired
//	private Validator validator;

	@Override
	@GetMapping(value = "/q/{id}")
	public List<ExamQuestionDomain> getQuestions(@PathVariable("id") Integer id) {
		List<ExamDefinitionDetailsEntity> list = edRepository.findOne(id).getQuestions();
		List<ExamQuestionDomain> questionList = new ArrayList<>();
		list.forEach((q) -> {
			ExamQuestionDomain domainQuestion = eddTransformer.eddEntityToQuesDomain(q); 
			questionList.add(domainQuestion);});
		return questionList;
	}

	@Override
	@GetMapping(value = "/a/{id}")
	public List<ExamAnswerDomain> getAnswers(Integer id) {
		List<ExamDefinitionDetailsEntity> list = edRepository.findOne(id).getQuestions();
		List<ExamAnswerDomain> answerList = new ArrayList<>();
		list.forEach((a) -> {
			ExamAnswerDomain domainAnswer = eddTransformer.eddEntityToAnsDomain(a); 
			answerList.add(domainAnswer);});
		return answerList;
	}

	@Override
	@PostMapping(value = "/c")
	public ExamDefinitionDetailsDomain createQuestion(@RequestBody ExamDefinitionDetailsDomain domain) {
		ExamDefinitionDetailsEntity entity = eddRepository.saveAndFlush(eddTransformer.eddDomainToEntity(domain));
		domain.setQid(entity.getQid());
		return domain;
	}
	
	@Override
	@PutMapping(value = "/p/{id}")
	public ExamDefinitionDetailsDomain updateQuestion(@PathVariable("id") Integer id, @RequestBody ExamDefinitionDetailsDomain domain) {
		domain.setQid(id);
		eddRepository.saveAndFlush(eddTransformer.eddDomainToEntity(domain));
		return domain;
	};
	
	@Override
	@DeleteMapping(value = "/d/{id}")
	public void deleteQuestion(@PathVariable("id") int id) {
		eddRepository.delete(id);
	}

}
