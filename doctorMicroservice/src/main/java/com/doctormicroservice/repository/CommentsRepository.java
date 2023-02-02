package com.doctormicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctormicroservice.entity.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
