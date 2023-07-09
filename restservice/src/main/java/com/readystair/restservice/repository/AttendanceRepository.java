package com.readystair.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.readystair.restservice.entities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
