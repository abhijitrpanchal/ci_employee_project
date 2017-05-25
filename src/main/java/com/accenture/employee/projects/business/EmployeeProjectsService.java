/**
 * 
 */
package com.accenture.employee.projects.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.accenture.employee.projects.vo.Project;

/**
 * @author j.venugopalan
 *
 */
@SpringBootApplication
@Service
@Component
public class EmployeeProjectsService {
	
	@Autowired
	EmployeeProjectsAgrregator employeeProjectsAgrregator;
	
	/**
	 * 
	 * @param employeeId
	 * @return Employee Object
	 */
	public Project getProjectDetails(Integer projectId){
		Project emp = new Project();
		emp = employeeProjectsAgrregator.getProjectEntity(projectId);
		return emp;
	}
	
}
