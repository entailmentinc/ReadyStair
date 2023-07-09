package com.readystair.restservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SiteDto {

	private Long siteId;
    
    private String siteCode;
    
    private String siteName;
    
    private String siteAddress;

    private String siteLatitude;
    
    private String siteLongitude;
}
