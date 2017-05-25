/**
 * 
 */
package com.accenture.employee.projects.vo;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author abhijit.panchal
 *
 */


@Document
public class Project {
	
	@Id
	private BigInteger id;
	private Integer projectId;
	private String project;
	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	private String chargeCode;
	
	
	
	public Project(Integer projectId) {
		super();
		this.projectId = projectId;
	}

	public Project(Integer projectId, String project, Integer employeeId, String employeeName, String employeeAddress, String chargeCode) {
		super();
		this.projectId = projectId;
		this.project = project;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.chargeCode = chargeCode;
	}
	public Project() {
		super();
	}
	
	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getChargeCode() {
		return chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", employeeId=" + employeeId + 
				", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + ", chargeCode=" + chargeCode +" ]";
	}
	
	

}
