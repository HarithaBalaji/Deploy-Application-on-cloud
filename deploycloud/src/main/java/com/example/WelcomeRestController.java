package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeRestController {
	@GetMapping("/")
  public String welcome() {
	  return "welcome to the deploying the application in cloud";
	
}
}
