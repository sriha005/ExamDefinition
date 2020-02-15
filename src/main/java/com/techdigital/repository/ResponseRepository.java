package com.techdigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techdigital.entity.ExamDefinitionEntity;
import com.techdigital.entity.ResponseEntity;

@Repository
public interface ResponseRepository extends JpaRepository<ResponseEntity, Integer>{

	@Query(value="select e from ResponseEntity e where e.userExamID = :eid")
	ResponseEntity findOne(@Param("eid") int eid);
}