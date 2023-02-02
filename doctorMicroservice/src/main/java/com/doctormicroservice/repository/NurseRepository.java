package com.doctormicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctormicroservice.entity.NurseDetails;

@Repository
public interface NurseRepository extends JpaRepository<NurseDetails, Integer> {

}
