package com.simpleTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import sun.reflect.Reflection;

/**
 * 不支持JDK1.8
 * */
public class Log4JUtils {
	private static Logger logger = null;
	
	public static Logger getLogger(){
		PropertyConfigurator.configure("/home/dingf/myGitRepository/myCode/Log4J/TestLog4J/src/log4j.properties");
		if(null == logger){
			logger=Logger.getLogger(Reflection.getCallerClass().getClass());
			logger.debug("调用者类名"+Reflection.getCallerClass().getName());
		}
		return logger;
	}
}