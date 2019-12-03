package com.app.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.SwaggerDemoApplicationTests;

public class HomeControllerTest extends SwaggerDemoApplicationTests{

	@Autowired
	private HomeController homeController;
	
	@Test
	public void defaultCallTest() {
		assertEquals("Welcome to spring boot project along with circle CI integration", homeController.defaultCall());
	}
}