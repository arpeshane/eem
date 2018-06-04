package com.nice.eem.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * @author ajit.p
 *
 */
@Entity
@Table(name = "workflexdatastatus_concentrix_site")
public class ConcentrixSiteEntity extends AbstractSiteDataEntity {

	ConcentrixSiteEntity() {
		super();
	}
}