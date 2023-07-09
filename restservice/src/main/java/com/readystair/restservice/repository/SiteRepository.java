package com.readystair.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.readystair.restservice.entities.Site;

public interface SiteRepository extends JpaRepository<Site, Long> {

}
