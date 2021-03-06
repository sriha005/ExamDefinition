package com.techdigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techdigital.entity.ExamDefinitionDetailsEntity;
import com.techdigital.entity.ExamDefinitionEntity;

@Repository
public interface ExamDefinitionRepository extends JpaRepository<ExamDefinitionEntity, Integer>{

	@Query(value="select e from ExamDefinitionEntity e where e.examID = :eid")
	ExamDefinitionEntity findOne(@Param("eid") int eid);
}
