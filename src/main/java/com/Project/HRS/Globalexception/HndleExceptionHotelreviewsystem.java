package com.Project.HRS.Globalexception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HndleExceptionHotelreviewsystem {
	
	@ExceptionHandler(NoSuchElementException.class)
	ResponseEntity<String> handleexception(NoSuchElementException ex){
		return new ResponseEntity<String>("exception caught ,please check", HttpStatus.BAD_REQUEST) ;
	}
		

//@ExceptionHandler(InterruptedException.class)
//ResponseEntity<String> handleEx(InterruptedException ex){
//	return new ResponseEntity<String>("Interrupted exception caught,please check",HttpStatus.BAD_REQUEST);
//}
}
