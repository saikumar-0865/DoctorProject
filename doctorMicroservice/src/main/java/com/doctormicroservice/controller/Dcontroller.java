package com.doctormicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.doctormicroservice.entity.Comments;
import com.doctormicroservice.service.CommentService;
import com.doctormicroservice.service.DoctorDetailsService;
import com.doctormicroservice.service.NurseDetailsService;
import com.doctormicroservice.service.PatientDetailsService;

@RestController
public class Dcontroller {
	
	@Autowired
	private DoctorDetailsService doctorDetailsService;
	
	@Autowired
	private PatientDetailsService patientDetailsService;
	
	@Autowired
	private CommentService commentService;
	
	
	@Autowired
	private NurseDetailsService nurseDetailsService;
	
	public Comments savecomments(Comments comments) {
		comments.setComments(comments.getComments());
		comments.setPatients(comments.getPatients());
		
	}
	
	
	
	

}
