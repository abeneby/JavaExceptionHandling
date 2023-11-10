package com.cogent.ExceptionHandling.exception;

public class MyException extends RuntimeException {
	public MyException(String msg) {
		super(msg); 
		System.out.println("Printing form"+this.getClass());
	}

}
