package com.mlm.agro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomeExceptionHandler {

	@ExceptionHandler(value = UserRegisterException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse handleException(UserRegisterException exception) {
		return new ErrorResponse(HttpStatus.FORBIDDEN.value(), exception.getMessage());
	}

}
