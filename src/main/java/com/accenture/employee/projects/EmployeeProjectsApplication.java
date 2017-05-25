package com.accenture.employee.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
/**
 * 
 * @author abhijit.panchal
 *
 */
public class EmployeeProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectsApplication.class, args);
	}
}
