package com.revature.logging;

import org.apache.log4j.Logger;

public class LoggingExample {
	
	//final static Logger logger = Logger.getRootLogger();
	final static Logger logger = Logger.getLogger(LoggingExample.class);

	
	public static void main(String[] args) {
		LoggingExample.example("This is my test message!");
	}

	public static void example(String input){
		
		logger.trace(input);
		logger.debug(input);
		logger.info(input);
		logger.warn(input);
		logger.error(input);
		logger.fatal(input);
	}
}
