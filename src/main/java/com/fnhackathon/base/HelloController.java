package com.fnhackathon.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("api/start")
	public String index() {
		return "Application Started";
	}
	@GetMapping("api/stop")
	public String index1() {
		return "Application Stopped";
	}

}
