package com.techdigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techdigital.entity.ExamDefinitionDetailsEntity;
import com.techdigital.entity.ExamDefinitionEntity;

@Repository
public interface ExamDefinitionRepository extends JpaRepository<ExamDefinitionEntity, Integer>{

}
