package com.readystair.restservice.mapper;

import java.util.ArrayList;
import java.util.List;

import com.readystair.restservice.dto.SiteDto;
import com.readystair.restservice.entities.Site;

public class SiteMapper {

	public List<SiteDto> mapSiteToSiteDto(List<Site> siteList) {
		
		List<SiteDto> siteDtoList = new ArrayList<>();
		
		for(Site site: siteList) {
			SiteDto siteDto = new SiteDto();
			siteDto.setSiteId(site.getSiteId());
			siteDto.setSiteCode(site.getSiteCode());
			siteDto.setSiteName(site.getSiteName());
			siteDto.setSiteAddress(site.getSiteAddress());
			siteDto.setSiteLatitude(site.getSiteLatitude());
			siteDto.setSiteLongitude(site.getSiteLongitude());
			
			siteDtoList.add(siteDto);
		}
		
		return siteDtoList;
		
	}
}
