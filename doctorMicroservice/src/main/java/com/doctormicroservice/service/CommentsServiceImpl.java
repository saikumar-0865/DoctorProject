package com.doctormicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctormicroservice.repository.CommentsRepository;

@Service
public class CommentsServiceImpl implements CommentService {
	
	
	@Autowired
	private CommentsRepository commentsRepository;

}
