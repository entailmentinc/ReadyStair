package com.readystair.restservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.readystair.restservice.dto.SiteDto;
import com.readystair.restservice.entities.Site;
import com.readystair.restservice.mapper.SiteMapper;
import com.readystair.restservice.repository.SiteRepository;
import com.readystair.restservice.service.SiteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class SiteServiceImpl implements SiteService {

	private SiteRepository siteRepository;
	
	private SiteMapper siteMapper;
	
	@Override
	public void addSite(SiteDto siteDto) {
		
		Site site = new Site();
		site.setSiteCode(siteDto.getSiteCode());
		site.setSiteName(siteDto.getSiteName());
		site.setOrgId((long) 1);
		site.setSiteAddress(siteDto.getSiteAddress());
		site.setSiteLatitude(siteDto.getSiteLatitude());
		site.setSiteLongitude(siteDto.getSiteLongitude());
		
		siteRepository.save(site);
		
	}

	@Override
	public SiteDto getSiteById(Long siteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SiteDto> getAllSites() {
		List<Site> siteList = siteRepository.findAll();
		List<SiteDto> siteDtoList = siteMapper.mapSiteToSiteDto(siteList);
		return siteDtoList;
	}

	@Override
	public void updateSite(SiteDto siteDto) {
		
		Site site = siteRepository.findById(siteDto.getSiteId()).get();
		site.setSiteCode(siteDto.getSiteCode());
		site.setSiteName(siteDto.getSiteName());
		site.setSiteAddress(siteDto.getSiteAddress());
		site.setSiteLatitude(siteDto.getSiteLatitude());
		site.setSiteLongitude(siteDto.getSiteLongitude());
		
		siteRepository.save(site);
	}

	@Override
	public void deleteSite(Long siteId) {
		
		siteRepository.deleteById(siteId);
	}

}
