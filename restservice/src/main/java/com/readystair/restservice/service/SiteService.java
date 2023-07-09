package com.readystair.restservice.service;

import java.util.List;

import com.readystair.restservice.dto.SiteDto;
import com.readystair.restservice.entities.Site;

public interface SiteService {

	void addSite(SiteDto siteDto);

	SiteDto getSiteById(Long siteId);

    List<SiteDto> getAllSites();

    void updateSite(SiteDto siteDto);

    void deleteSite(Long siteId);
}
