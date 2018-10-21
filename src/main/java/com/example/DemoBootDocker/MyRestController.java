package com.example.DemoBootDocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hi There from Docker";
	}
}
