package com.springboot.springboot.model;

import org.springframework.http.HttpStatus;

public class ExceptionMessage {
	
	private HttpStatus status;
	private String message;
	public ExceptionMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public ExceptionMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
