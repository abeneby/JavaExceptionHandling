package com.cogent.ExceptionHandling.exception;

public class MyQuotaReachedException extends RuntimeException {
	private static final long serialVersionUID = 1L ; 
	
	public MyQuotaReachedException(String msg) {
		super(msg); 
		System.out.println("printing form "+this.getClass());
	}
}
