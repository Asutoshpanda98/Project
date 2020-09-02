package com.cg.scheduleprogramservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.scheduleprogramservice.entity.ScheduleEntity;
import com.cg.scheduleprogramservice.repository.ScheduleRepository;

public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public Iterable<ScheduleEntity> getAllSchedules() {
		// TODO Auto-generated method stub
		return scheduleRepository.findAll();
	}


}
