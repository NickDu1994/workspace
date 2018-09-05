package com.dkingdom.controller;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class APIController {
	
	// https://stackoverflow.com/questions/7312436/spring-mvc-how-to-get-all-request-params-in-a-map-in-spring-controller
	// https://blog.csdn.net/xiao______xin/article/details/78216155

	@RequestMapping(value = "/advices", method = RequestMethod.GET)
	public String getAdviceWithParms(
			@RequestParam Map<String, String> allRequestParams) {
		boolean isContainToDate = allRequestParams.containsKey("toDate");
		return "All Parms: " + allRequestParams.toString() + "\n"
				+ "is Contain ToDate Field? : "
				+ String.valueOf(isContainToDate);
	}

	@RequestMapping(value = "/advices/{adviceId}", method = RequestMethod.GET)
	public String getAdviceWithId(@PathVariable("adviceId") Integer adviceId) {
		return "adviceId: " + String.valueOf(adviceId);
	}
}
