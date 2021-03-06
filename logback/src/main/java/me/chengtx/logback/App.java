package me.chengtx.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		logger.trace("logback: Hello world!");
		logger.debug("logback: Hello world!");
		logger.info("logback: Hello world!");
		logger.warn("logback: Hello world!");
		logger.error("logback: Hello world!");
	}
}
