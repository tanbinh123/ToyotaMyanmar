package com.mttl.vlms.common.selectdto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.mttl.vlms.common.AbstractDto;

/**
 * BranchSelectDto
 *
 * 
 *
 */
public class ChassisNoSelectDto extends AbstractDto {

	private static final long serialVersionUID = -6739759968012146979L;

	private Integer vehicleInfoId;

	private String chassisNo;

	public Integer getVehicleInfoId() {
		return vehicleInfoId;
	}

	public void setVehicleInfoId(Integer vehicleInfoId) {
		this.vehicleInfoId = vehicleInfoId;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	@Override
	public boolean equals(Object object) {
		return EqualsBuilder.reflectionEquals(this, object);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
