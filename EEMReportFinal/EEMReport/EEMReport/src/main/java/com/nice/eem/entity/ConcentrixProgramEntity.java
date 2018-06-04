package com.nice.eem.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * 
 * @author ajit.p
 *
 */
@Entity
@Table(name = "workflexdatastatus_concentrix")
@NamedQuery(name = "ConcentrixProgramEntity.findAll", query="select u from ConcentrixProgramEntity u order by u.ctzDateTime DESC")
public class ConcentrixProgramEntity extends AbstractProgramDataEntity{
		
	
	
}