package org.webskey.gittest;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jTest {
	
	private static final Logger logger = Logger./*getLogger(Log4jTest.class.getName());*/getRootLogger();
	
	public static void main(String[] args) {
		
		Level prevLevel = logger.getLevel();
		logger.fatal("Domyœlny poziom logowania: "+prevLevel);
		logger.debug("Wpis #1");
		logger.error("error");
		logger.fatal("error");
		logger.warn("error");
		logger.info ("Wpis #2");
		logger.setLevel(Level.INFO);
		logger.debug("Wpis #3");
		logger.info ("Wpis #4");
		logger.setLevel(prevLevel);
	}
}