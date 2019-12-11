package com.techdigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.techdigital.entity.ExamDefinitionDetailsEntity;

@Repository
public interface ExamDefinitionDetailsRepository extends JpaRepository<ExamDefinitionDetailsEntity, Integer>{
}
