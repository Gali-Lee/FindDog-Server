package com.cos.jwt.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MeetingMember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String[] MeetingName;

	public String[] getMeetingName() {
		return MeetingName;
	}

	public void setMeetingName(String[] meetingName) {
		MeetingName = meetingName;
	}
	
	
	
}
