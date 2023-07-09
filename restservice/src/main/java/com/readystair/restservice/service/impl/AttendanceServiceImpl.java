package com.readystair.restservice.service.impl;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import com.readystair.restservice.dto.AttendanceDto;
import com.readystair.restservice.entities.Attendance;
import com.readystair.restservice.repository.AttendanceRepository;
import com.readystair.restservice.service.AttendanceService;

public class AttendanceServiceImpl implements AttendanceService {

	private AttendanceRepository attendanceRepository;
	
	@Override
	public void saveAttendance(AttendanceDto attendanceDto) {
		
		Attendance attendance = new Attendance();
		attendance.setUserId(attendanceDto.getUserId());
		attendance.setOrgId((long) 1);
		attendance.setSite_id(attendanceDto.getSite_id());
		attendance.setAttendenceDate(attendance.getAttendenceDate());
		attendance.setStartTime(attendance.getStartTime());
		attendance.setEndTime(attendance.getEndTime());
		attendance.setIsOvertime(attendance.getIsOvertime());
		
		attendance.setCreated_date(Timestamp.from(Instant.now()));
		attendance.setUpdated_date(Timestamp.from(Instant.now()));
		
		attendanceRepository.save(attendance);
	}

	@Override
	public AttendanceDto getAttendenceById(Long attendenceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AttendanceDto> getAllAttendence() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attendance updateAttendence(Attendance attendence) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAttendence(Long attendenceId) {
		// TODO Auto-generated method stub
		
	}

}
