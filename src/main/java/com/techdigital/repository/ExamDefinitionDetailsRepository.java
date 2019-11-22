package com.techdigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.techdigital.entity.ExamDefinitionDetails;

@Repository
public interface ExamDefinitionDetailsRepository extends JpaRepository<ExamDefinitionDetails, Integer>{

}
