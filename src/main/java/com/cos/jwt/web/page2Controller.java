package com.cos.jwt.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.jwt.dao.Meeting;
import com.cos.jwt.domain.person.PersonRepository;
import com.cos.jwt.repository.MeetingRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class page2Controller {
	private final MeetingRepository meetingRepository;
	
	@GetMapping("/Meeting")
	public List<Meeting> mtList() {
		return meetingRepository.findAll();  
	}
	
	@PostMapping("/Meeting")
	public String mtInsert(@RequestBody Meeting meeting) {
		try {
			meetingRepository.save(meeting);
			return "true";
		} catch (Exception e) {
			return "false";
		}
	}
}
