package com.nice.eem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.data.repository.NoRepositoryBean;

/**
 * 
 * @author ajit.p
 *
 */

@NoRepositoryBean
public class AbstractEemCommonEntity{

	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "modified_by")
	private String modifiedBy;
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	public AbstractEemCommonEntity() {
		super();
	}
	
	public AbstractEemCommonEntity(String createdBy, Date createdDate,
			String modifiedBy, Date lastModifiedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	@Override
	public String toString() {
		return "AbstractEemCommonEntity [createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	
}
	