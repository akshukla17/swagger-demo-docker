package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

	static Map<String, String> map = new HashMap<>();
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String getDefaultCall() {
		return "default Mock data";
	}
	
	@GetMapping(value = "/one")
	public String getOne() {
		return "return one mock item";
	}
}
