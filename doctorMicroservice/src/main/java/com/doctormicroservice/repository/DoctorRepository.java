package com.doctormicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctormicroservice.entity.DoctorDetails;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorDetails, Integer>{

}
