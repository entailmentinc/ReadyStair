package com.readystair.restservice.entities;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "attendance")
public class Attendance extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(name = "attendance_id")
    private Long attendenceId;
    
    @Column(name = "user_id")
    private Long userId;
    
    @Column(name = "site_id")
    private Long site_id;
    
    @Column(name = "attendence_date")
    private Timestamp attendenceDate;
    
    @Column(name = "start_time")
    private Timestamp startTime;
    
    @Column(name = "end_time")
    private Timestamp endTime;
    
    @Column(name = "is_overtime")
    private String isOvertime;
    
}
