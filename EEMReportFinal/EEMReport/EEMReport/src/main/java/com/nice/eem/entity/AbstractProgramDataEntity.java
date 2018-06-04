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
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractProgramDataEntity extends AbstractWorkflexDataStatusEntity{
	
	@Column(name = "loginhoursactual")
	private double loginHoursActual;
	@Column(name = "abandonedcalls")
	private int abandonedCalls;
	@Column(name = "answeredcalls")
	private int answeredCalls;
	@Column(name = "acw")
	private double acw;
	@Column(name = "talktime")
	private double talkTime;
	@Column(name = "ahtactual")
	private double ahtActual;
	@Column(name = "occupancy")
	private double occupancy;
	@Column(name = "servicelevel")
	private double serviceLevel;
	@Column(name = "successrecordsinwfm")
	private int successRecordsInWfm;
	@Column(name = "failedrecordsinwfm")
	private int failedRecordsInWfm;
	
	
	
	public AbstractProgramDataEntity() {
		super();
	}
	
	
	public AbstractProgramDataEntity(double loginHoursActual, int abandonedCalls, int answeredCalls, double acw,
			double talkTime, double ahtActual, double occupancy, double serviceLevel, int successRecordsInWfm,
			int failedRecordsInWfm) {
		super();
		this.loginHoursActual = loginHoursActual;
		this.abandonedCalls = abandonedCalls;
		this.answeredCalls = answeredCalls;
		this.acw = acw;
		this.talkTime = talkTime;
		this.ahtActual = ahtActual;
		this.occupancy = occupancy;
		this.serviceLevel = serviceLevel;
		this.successRecordsInWfm = successRecordsInWfm;
		this.failedRecordsInWfm = failedRecordsInWfm;
	}


	@Override
	public String toString() {
		return "BaseProgramDataEntity [loginhoursactual=" + loginHoursActual + ", abandonedcalls=" + abandonedCalls
				+ ", answeredcalls=" + answeredCalls + ", acw=" + acw + ", talktime=" + talkTime + ", ahtactual="
				+ ahtActual + ", occupancy=" + occupancy + ", servicelevel=" + serviceLevel + ", successrecordsinwfm="
				+ successRecordsInWfm + ", failedrecordsinwfm=" + failedRecordsInWfm + "]";
	}
	
}
