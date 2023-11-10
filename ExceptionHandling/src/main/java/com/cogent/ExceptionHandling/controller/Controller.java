package com.cogent.ExceptionHandling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.ExceptionHandling.exception.MyException;
import com.cogent.ExceptionHandling.exception.MyQuotaReachedException;

@RestController
public class Controller {
	
	@GetMapping(value= "/exceptioncall")
	public String exceptiondemo() {
		if(true) {
			throw new RuntimeException(); 
		}
		return "exception created"; 
	}
	
	@GetMapping(value= "/exceptionhandle")
	public String exceptionhandle() {
		System.out.println("start here");
			if(true) {
				throw new MyException("<marquee><h1 style='color:red'>Hi everyone</h1></marquee>"); 
			}
		System.out.println("end here");
		return "exception created"; 
	}
	
	@GetMapping(value= "/quotaReached/{gb}")
	public String get(@PathVariable int gb) {
		System.out.println("start here");
		String msg =""; 
			if(gb >= 2048) {
				msg = "<marquee><h1 style='color:red'>computer is over heating</h1></marquee>"; 
				throw new MyQuotaReachedException(msg); 
			}else msg = "<marquee><h1 style='color:pink'>keep going homie</h1></marquee>"; 
			System.out.println("end here"); 
			
			return msg; 
	}

}
