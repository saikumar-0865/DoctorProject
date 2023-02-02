package com.doctormicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctormicroservice.repository.PatientRepository;

@Service
public class PatientDetailsServiceImpl implements PatientDetailsService {
	
	
	@Autowired
	private PatientRepository patientRepository;

}
