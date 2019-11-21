package com.carlosgarcia.autentia.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.carlosgarcia.autentia.model.ErrorResponse;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception e){
		return new ResponseEntity<ErrorResponse>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
