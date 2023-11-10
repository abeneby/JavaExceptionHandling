package com.cogent.ExceptionHandling.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cogent.ExceptionHandling.exception.MyQuotaReachedException;


@ControllerAdvice
public class ControllerAdvise {
	
	
	@ExceptionHandler(value = MyQuotaReachedException.class)
	public ResponseEntity<Object> exceptionHandle1(MyQuotaReachedException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}

}

