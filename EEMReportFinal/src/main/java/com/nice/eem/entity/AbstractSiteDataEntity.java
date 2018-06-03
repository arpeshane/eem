package com.nice.eem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
/**
 * 
 * @author ajit.p
 *
 */

@Entity	
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractSiteDataEntity extends AbstractWorkflexDataStatusEntity{
	@Column(name = "siteid")
	private int siteId;
	@Column(name = "sitename")
	private String siteName;
	public AbstractSiteDataEntity() {
		super();
	}
	public AbstractSiteDataEntity(int siteId, String siteName) {
		super();
		this.siteId = siteId;
		this.siteName = siteName;
	}
	public int getSiteid() {
		return siteId;
	}
	public void setSiteid(int siteid) {
		this.siteId = siteid;
	}
	public String getSitename() {
		return siteName;
	}
	public void setSitename(String sitename) {
		this.siteName = sitename;
	}
	@Override
	public String toString() {
		return "BaseSiteDataEntity [siteid=" + siteId + ", sitename=" + siteName + "]";
	}
	
	
}