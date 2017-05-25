/**
 * 
 */
package com.accenture.employee.projects.business;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.employee.projects.vo.Project;

/**
 * @author j.venugopalan
 *
 */
@SpringBootApplication
public class EmployeeProjectsAgrregator {
	/**
	 * 
	 * @param id
	 * @return Project
	 * Mock Project object
	 */
	public Project getProjectEntity(Integer id){
		Project prj = new Project();
		prj.setEmployeeId(id);
		prj.setEmployeeName("Victor Sam");
		prj.setEmployeeAddress("New Jersey, US");
		return prj;
	}


}
