package com.iiht.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloController {

	@GetMapping("/connection")
	public String confirm() {
		return "connected...............responding";
		
	}
	
	
	  @GetMapping("/square/{n}") 
	  public String squareNum(@PathVariable int n) {
		  return "square of "+n+"="+n*n;
	  
	  }
	 
}