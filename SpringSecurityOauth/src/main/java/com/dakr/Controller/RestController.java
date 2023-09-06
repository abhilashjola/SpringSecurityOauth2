package com.dakr.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String get() {
		return "welcome to our new Oauth2 api";
	}
}
