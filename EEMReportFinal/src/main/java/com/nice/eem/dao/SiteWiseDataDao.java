package com.nice.eem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nice.eem.entity.ConcentrixSiteEntity;

/**
 * 
 * @author ajit.p
 *
 */

@Repository
public interface SiteWiseDataDao extends JpaRepository<ConcentrixSiteEntity, Long> {

	@Override
	public List<ConcentrixSiteEntity> findAll();
}
