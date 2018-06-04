package com.nice.eem.service;

import java.util.List;

import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.entity.ConcentrixSiteEntity;

/**
 * 
 * @author ajit.p
 *
 */
public interface SiteWiseDataService {

	public List<ConcentrixSiteEntity> findAll();

	public List<SiteWiseDataDto> findAllSiteWiseData();

}
