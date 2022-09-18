package com.springboot.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.springboot.springboot.model.ExceptionMessage;

@ControllerAdvice

public class MainExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ExceptionMessage employeenotfound(EmployeeNotFoundException exception_employee)
	{
		ExceptionMessage em=new ExceptionMessage(HttpStatus.NOT_FOUND,exception_employee.getMessage());
		return em;
	}
	
	//For all general exceptions we can use this 
	@ExceptionHandler(Exception.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ExceptionMessage GeneralException(Exception GeneralException)
	{
		ExceptionMessage GeneralException1=new ExceptionMessage(HttpStatus.INTERNAL_SERVER_ERROR,GeneralException.getMessage());
		return GeneralException1;
	}
	
	
}
