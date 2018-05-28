package com.dkingdom.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class APIController {
	private int balance = 10000;
	@RequestMapping(value = "/login", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String login(String password) {
		if (password.equals("123456")) {
			return "{\"auth\":\"true\"}";
		}else {
			return "{\"auth\":\"false\"}";
		}
	}
	
	@RequestMapping(value = "/query", produces= { MediaType.APPLICATION_JSON_VALUE })
	public String query() {
		return "{\"balance\":\"" + balance + "\"}";
	}
	
	@RequestMapping(value = "/withdraw", produces = { MediaType.APPLICATION_JSON_VALUE})
	public String withdraw(String number) {
		balance = balance - Integer.parseInt(number);
		return "{\"balance\":\"" + balance + "\"}";
	}
}
