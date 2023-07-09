package com.readystair.restservice.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AttendanceDto {

	private Long attendenceId;
    
    private Long userId;
    
    private Long site_id;
    
    private Timestamp attendenceDate;
    
    private Timestamp startTime;
    
    private Timestamp endTime;
    
    private String isOvertime;
}
