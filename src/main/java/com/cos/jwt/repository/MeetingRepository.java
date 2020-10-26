package com.cos.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.jwt.dao.Meeting;

public interface MeetingRepository extends JpaRepository<Meeting, Integer>{

	
}
