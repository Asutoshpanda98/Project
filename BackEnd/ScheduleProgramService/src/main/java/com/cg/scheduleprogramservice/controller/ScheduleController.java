package com.cg.scheduleprogramservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.scheduleprogramservice.entity.ScheduleEntity;
import com.cg.scheduleprogramservice.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;
	
	
	@GetMapping("/getallschedules")
	public Iterable<ScheduleEntity> getAllSchedule() {
		return scheduleService.getAllSchedules();
	}

}
