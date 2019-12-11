package com.techdigital.impl.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techdigital.domain.ExamAnswerDomain;
import com.techdigital.domain.ExamDefinitionDetailsDomain;
import com.techdigital.domain.ExamQuestionDomain;
import com.techdigital.entity.ExamDefinitionDetailsEntity;
import com.techdigital.repository.ExamDefinitionRepository;

@Component
public class EddTransformer {
	
	@Autowired
	ExamDefinitionRepository edRepository;
	
	public ExamAnswerDomain eddEntityToAnsDomain(ExamDefinitionDetailsEntity entity) {
		return new ExamAnswerDomain(entity.getQid(), entity.getExam().getExamId(), entity.getQuestionAnswer());
	}
	public ExamQuestionDomain eddEntityToQuesDomain(ExamDefinitionDetailsEntity entity) {
		return new ExamQuestionDomain(entity.getQid(), entity.getExam().getExamId(), entity.getQuestionText(), entity.getQuestionOptions());
	}
	public ExamDefinitionDetailsEntity eddDomainToEntity(ExamDefinitionDetailsDomain domain) {
		ExamDefinitionDetailsEntity entity;
		if(domain.getQid() == null) {
			entity = new ExamDefinitionDetailsEntity(domain.getQuestionText(), domain.getQuestionAnswer(), domain.getQuestionOptions(), edRepository.findOne(domain.getEid()));	
		}
		else {
			entity = new ExamDefinitionDetailsEntity(domain.getQid(), domain.getQuestionText(), domain.getQuestionAnswer(), domain.getQuestionOptions(), edRepository.findOne(domain.getEid()));
		}
		return entity;
	}
}
