package com.readystair.restservice.entities;

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
@Table(name = "site")
public class Site extends BaseEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(name = "site_id")
    private Long siteId;
    
    @Column(name = "site_code")
    private String siteCode;
    
    @Column(name = "site_name")
    private String siteName;
    
    @Column(name = "site_address")
    private String siteAddress;
    
    @Column(name = "site_latitude")
    private String siteLatitude;
    
    @Column(name = "site_longitude")
    private String siteLongitude;
    
}
