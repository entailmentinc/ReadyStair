package com.readystair.restservice.entities;

import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

	@Column(name = "org_id")
	private Long orgId;
	 
	@Column(name = "display_flag")
	private String display_flag;
	 
	@Column(name = "active_flag")
	private String active_flag;
	 
	@Column(name = "created_by")
	private String created_by;
	 
	@Column(name = "created_date")
	private Timestamp created_date;
	 
	@Column(name = "updated_by")
	private String updated_by;
	 
	@Column(name = "updated_date")
	private Timestamp updated_date;
}
