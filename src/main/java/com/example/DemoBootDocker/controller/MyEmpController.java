package com.example.DemoBootDocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DemoBootDocker.model.Employee;

@RestController
public class MyEmpController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/getEmp")
	public List getEmp() {
		return jdbcTemplate.queryForList("SELECT * FROM emp LIMIT 10,100");
	}
}
