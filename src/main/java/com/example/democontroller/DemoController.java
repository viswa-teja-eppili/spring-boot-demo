package com.example.democontroller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	 
		@GetMapping("/")
		public void Hellospring() {
			System.out.println("welcome to spring boot application");
	}
}
