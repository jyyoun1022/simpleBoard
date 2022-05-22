package org.codej.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.log4j.Log4j;

@ControllerAdvice
@Log4j
public class CommonExceptrionAdvice {
	
//	@ExceptionHandler(Exception.class)
//	public String except(Exception e,Model model) {
//		log.error("Exception....."+e.getMessage());
//		model.addAttribute("exception",e);
//		log.error(model);
//		
//		return "error_page";
//	}
	
	   @ExceptionHandler(NoHandlerFoundException.class)
	   @ResponseStatus(HttpStatus.NOT_FOUND)
	    public String Handle404(NoHandlerFoundException e){
		   log.info("============");
		   log.info(e.getMessage());
		   log.info("-============");
	        return "custom404";
	    }
	

}
