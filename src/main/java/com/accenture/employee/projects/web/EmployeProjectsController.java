package com.accenture.employee.projects.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.employee.projects.business.EmployeeProjectsService;
import com.accenture.employee.projects.repository.ProjectRepository;
import com.accenture.employee.projects.vo.Project;

@RestController
@SpringBootApplication
public class EmployeProjectsController {
	@Autowired
	EmployeeProjectsService employeeProjectsService;
	
	@Autowired
	private ProjectRepository repository;
	
	@RequestMapping(value="/projects/{projectId}")
	public Project getProjectDetails(@PathVariable ("projectId") Integer projectId){
		System.out.println("inside getProjectDetails");
		System.out.println("project Id = " + projectId);
		return repository.findByProjectId(projectId);
	}

}
					