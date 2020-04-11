package com.springboot.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloLogging {

	Logger logger = LoggerFactory.getLogger(HelloLogging.class);
	
	@RequestMapping("/hello")
	public String helloLoggin( ) {
		//Error
		//Warn
		//Info
		//Debug
		//Trace
		
		logger.error("Error Message");
		logger.info("Info MEssage");
		logger.warn("Warning message");
		
		logger.debug("debug message");
		logger.trace("Trace message");
		return "Hello Logging";
	}
}
