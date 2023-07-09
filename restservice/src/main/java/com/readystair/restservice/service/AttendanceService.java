package com.readystair.restservice.service;

import java.util.List;

import com.readystair.restservice.dto.AttendanceDto;
import com.readystair.restservice.entities.Attendance;

public interface AttendanceService {

	void saveAttendance(AttendanceDto attendenceDto);

	AttendanceDto getAttendenceById(Long attendenceId);

    List<AttendanceDto> getAllAttendence();

    Attendance updateAttendence(Attendance attendence);

    void deleteAttendence(Long attendenceId);
}
