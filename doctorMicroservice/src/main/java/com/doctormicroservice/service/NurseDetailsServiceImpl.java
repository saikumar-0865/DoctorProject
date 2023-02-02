package com.doctormicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctormicroservice.repository.NurseRepository;

@Service
public class NurseDetailsServiceImpl implements NurseDetailsService {
	
	@Autowired
	private NurseRepository nurseRepository;

}
