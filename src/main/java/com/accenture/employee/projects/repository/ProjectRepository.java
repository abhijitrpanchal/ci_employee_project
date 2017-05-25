package com.accenture.employee.projects.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.accenture.employee.projects.vo.Project;

public interface ProjectRepository extends MongoRepository<Project, Integer>{
	
		public Project findByProjectId(Integer projectId);
}
