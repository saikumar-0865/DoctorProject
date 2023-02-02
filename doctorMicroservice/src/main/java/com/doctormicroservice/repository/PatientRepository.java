package com.doctormicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctormicroservice.entity.PatientDetails;

@Repository
public interface PatientRepository extends JpaRepository<PatientDetails, Integer> {

}
