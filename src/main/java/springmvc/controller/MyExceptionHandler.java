package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//Here we can do the centralized exception handling for complete project

@ControllerAdvice
public class MyExceptionHandler {
		
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	  @ExceptionHandler(value = NullPointerException.class) 
	  public String exceptionHandler() { return "null_page"; }
	  
	  
	  @ResponseStatus(value = HttpStatus.BAD_GATEWAY)
	  @ExceptionHandler({NullPointerException.class, ArithmeticException.class})
	  public String exceptionHandle() { return "null_page"; }
}
