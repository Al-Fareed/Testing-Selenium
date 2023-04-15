package com.seleniumTester;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@PostMapping("/test")
	public String test(@RequestBody HashMap<String, String> v ) {
		return "Success whohhoo "+v.get("Name");
	}
}
