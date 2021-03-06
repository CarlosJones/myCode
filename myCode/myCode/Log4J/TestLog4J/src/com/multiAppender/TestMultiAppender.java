package com.multiAppender;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class TestMultiAppender {

	@Test
	public void test() {
		Logger logger = Logger.getLogger(TestMultiAppender.class);
        
//      PropertyConfigurator.configure("/home/dingf/myGitRepository/myCode/Log4J/TestLog4J/src/log4j-multiAppender.properties");
        PropertyConfigurator.configure("src/log4j-multiAppender.properties");
        logger.debug("Here is DEBUG messgae");
        logger.info("Here is INFO message");
        logger.warn("Here is WARN message");
        logger.error("Here is ERROR message");
        logger.fatal("Here is FATAL message");
	}

}
