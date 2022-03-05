package com.saikrupa.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.saikrupa.entities.CustomerDetails;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "Hello";
	}

	@RequestMapping(value = "/saveUserDetails", method = RequestMethod.GET)
	public String saveUserDetails() {
		String jsonStr = null;
		CustomerDetails customer = new CustomerDetails();
		customer.setBuildingNumber("Bulding A2");
		customer.setEmailAddress("Aditya@test.com");
		customer.setFlatNumber("401");
		customer.setMobileNo("9890119011");
		customer.setName("Aditya Gopal");
		try {
			ObjectMapper Obj = new ObjectMapper();
			jsonStr = Obj.writeValueAsString(customer);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		if(jsonStr.isEmpty()) {
			return "failed";
		}
		else {
			return jsonStr;	
		}
	}
	
	@RequestMapping(value = "/saveNewOrder", method = RequestMethod.GET)
	public String saveNewOrder() {
		return "";
	}
	
}
