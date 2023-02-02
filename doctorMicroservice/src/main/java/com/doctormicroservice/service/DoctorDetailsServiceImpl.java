package com.doctormicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctormicroservice.repository.DoctorRepository;

@Service
public class DoctorDetailsServiceImpl implements DoctorDetailsService {
	
	@Autowired
	private DoctorRepository doctorRepository;

}
