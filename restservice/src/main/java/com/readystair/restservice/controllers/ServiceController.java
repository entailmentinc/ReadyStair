package com.readystair.restservice.controllers;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.readystair.restservice.dto.AttendanceDto;
import com.readystair.restservice.dto.AuthDto;
import com.readystair.restservice.dto.LoginDataDto;
import com.readystair.restservice.dto.SiteDto;
import com.readystair.restservice.dto.UserDto;
import com.readystair.restservice.entities.ResponseBody;
import com.readystair.restservice.service.AttendanceService;
import com.readystair.restservice.service.SiteService;
import com.readystair.restservice.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@RestController
public class ServiceController extends BaseController {
	
	/** The Constant log. */
	protected static final Logger log = LogManager.getLogger(ServiceController.class);
	
	private UserService userService;
	
	private SiteService siteService;
	
	private AttendanceService attendanceService;

	/**
	 * Return application working status
	 * @return
	 */
	@RequestMapping(value ="/testService", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBody>testService(HttpServletRequest request, HttpServletResponse response) throws IOException {
		log.info("Inside testService");
		HttpStatus status = HttpStatus.OK;
		String msg = null;
		try {
			msg = "application working fine";
		} catch (Exception ex) {
			log.error("Exception in " +request.getRequestURI() , ex);
			status = HttpStatus.NOT_FOUND;
			return prepareResponse(null, status, Boolean.FALSE);
		}
		
		return prepareResponse(msg, status, Boolean.TRUE);
	}
	
	/**
	 * Return user Info
	 * @return
	 */
	@RequestMapping(value ="/getUserInfo", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBody>getUser(@PathVariable("userId") Long userId, HttpServletRequest request) throws IOException {
		log.info("Inside getUser");
		HttpStatus status = HttpStatus.OK;
		UserDto userData = null;
		try {
			userData = userService.getUserById(userId);
		} catch (Exception ex) {
			log.error("Exception in " +request.getRequestURI() , ex);
			status = HttpStatus.NOT_FOUND;
			return prepareResponse(null, status, Boolean.FALSE);
		}
		
		return prepareResponse(userData, status, Boolean.TRUE);
	}
	
	/**
	 * Return login Info
	 * @return
	 */
	@RequestMapping(value ="/login", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBody>login(@RequestBody AuthDto authDto, HttpServletRequest request) throws IOException {
		log.info("Inside login");
		HttpStatus status = HttpStatus.OK;
		LoginDataDto loginData = null;
		try {
			loginData = userService.getlogin(authDto);
		} catch (Exception ex) {
			log.error("Exception in " +request.getRequestURI() , ex);
			status = HttpStatus.NOT_FOUND;
			return prepareResponse(null, status, Boolean.FALSE);
		}
		
		if (loginData != null)
			return prepareResponse(loginData, status, Boolean.TRUE);
		else
			return prepareResponse("User is not valid", status, Boolean.FALSE);
	}
	
	/**
	 * Return all site Info
	 * @return
	 */
	@RequestMapping(value ="/getAllSites", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBody>getAllSites(HttpServletRequest request) throws IOException {
		log.info("Inside getAllSites");
		HttpStatus status = HttpStatus.OK;
		List<SiteDto> siteDto = null;
		try {
			siteDto = siteService.getAllSites();
		} catch (Exception ex) {
			log.error("Exception in " +request.getRequestURI() , ex);
			status = HttpStatus.NOT_FOUND;
			return prepareResponse(null, status, Boolean.FALSE);
		}
		
		return prepareResponse(siteDto, status, Boolean.TRUE);
	}
	
	/**
	 * Save Attendance
	 * @return
	 */
	@RequestMapping(value ="/saveAttendance", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBody>saveAttendance(@RequestBody AttendanceDto attendanceDto, HttpServletRequest request) throws IOException {
		log.info("Inside saveAttendance");
		HttpStatus status = HttpStatus.OK;
		try {
			attendanceService.saveAttendance(attendanceDto);
		} catch (Exception ex) {
			log.error("Exception in " +request.getRequestURI() , ex);
			status = HttpStatus.NOT_FOUND;
			return prepareResponse(null, status, Boolean.FALSE);
		}
		
		return prepareResponse("Attendance Saved Successfully", status, Boolean.TRUE);
	}
	
	/**
	 * Add Site
	 * @return
	 */
	@RequestMapping(value ="/addSite", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBody>login(@RequestBody SiteDto siteDto, HttpServletRequest request) throws IOException {
		log.info("Inside addSite");
		HttpStatus status = HttpStatus.OK;
		try {
			siteService.addSite(siteDto);
		} catch (Exception ex) {
			log.error("Exception in " +request.getRequestURI() , ex);
			status = HttpStatus.NOT_FOUND;
			return prepareResponse(null, status, Boolean.FALSE);
		}
		
		return prepareResponse("Site Added Successfully", status, Boolean.TRUE);
	}
	
	/**
	 * Update Site
	 * @return
	 */
	@RequestMapping(value ="/updateSite", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBody>updateSite(@RequestBody SiteDto siteDto, HttpServletRequest request) throws IOException {
		log.info("Inside updateSite");
		HttpStatus status = HttpStatus.OK;
		try {
			siteService.updateSite(siteDto);
		} catch (Exception ex) {
			log.error("Exception in " +request.getRequestURI() , ex);
			status = HttpStatus.NOT_FOUND;
			return prepareResponse(null, status, Boolean.FALSE);
		}
		
		return prepareResponse("Site Updated Successfully", status, Boolean.TRUE);
	}
	
	/**
	 * Delete Site
	 * @return
	 */
	@RequestMapping(value ="/deleteSite", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBody>deleteSite(@RequestBody SiteDto siteDto, HttpServletRequest request) throws IOException {
		log.info("Inside deleteSite");
		HttpStatus status = HttpStatus.OK;
		try {
			siteService.deleteSite(siteDto.getSiteId());
		} catch (Exception ex) {
			log.error("Exception in " +request.getRequestURI() , ex);
			status = HttpStatus.NOT_FOUND;
			return prepareResponse(null, status, Boolean.FALSE);
		}
		
		return prepareResponse("Site Deleted Successfully", status, Boolean.TRUE);
	}
}
