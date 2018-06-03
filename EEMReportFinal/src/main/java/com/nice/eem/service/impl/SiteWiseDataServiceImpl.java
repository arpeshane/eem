/**
 * 
 */
package com.nice.eem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nice.eem.dao.SiteWiseDataDao;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.entity.ConcentrixSiteEntity;
import com.nice.eem.service.SiteWiseDataService;

/**
 * @author ajit.p
 *
 */
@Service
public class SiteWiseDataServiceImpl implements SiteWiseDataService {

	@Autowired
	private SiteWiseDataDao siteWiseDataDao;

	@Override
	public List<SiteWiseDataDto> findAllSiteWiseData() {
		List<SiteWiseDataDto> siteWiseDataDtos = new ArrayList<SiteWiseDataDto>();
		List<ConcentrixSiteEntity> concentrixSiteEntities = siteWiseDataDao.findAll();
		ObjectMapper mapper = new ObjectMapper();

		for (ConcentrixSiteEntity concentrixSiteEntity : concentrixSiteEntities) {
			siteWiseDataDtos.add(mapper.convertValue(concentrixSiteEntity, SiteWiseDataDto.class));
		}

		return siteWiseDataDtos;
	}

	@Override
	public List<ConcentrixSiteEntity> findAll() {
		return null;
	}

}
