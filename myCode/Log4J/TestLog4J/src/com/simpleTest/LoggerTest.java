package com.simpleTest;

import org.junit.Test;

public class LoggerTest {
//	private static Logger log = Logger.getLogger(Object.class);
	
//	@Test
//	public void test() {
//		//使用默认的配置信息，不需要写log4j.properties
//	    BasicConfigurator.configure();
//	    //设置日志输出级别为info，这将覆盖配置文件中设置的级别
//	    log.setLevel(Level.INFO);
//		log.info("HelloWorld");
//	}
	
//	@Test
//	public void testUseProperties(){
//		PropertyConfigurator.configure("/home/dingf/myGitRepository/myCode/Log4J/TestLog4J/src/log4j.properties");
//		log.info("HelloWorld");
//	}
	
	@Test
	public void testLog4JUtils(){
		Log4JUtils.getLogger().debug("HelloWorld!");
	}
}