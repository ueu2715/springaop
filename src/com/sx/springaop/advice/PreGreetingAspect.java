package com.sx.springaop.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class PreGreetingAspect {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * �������argNames="clientName ����Ҫ��execution ������and args(clientName)"
	 * @param clientName
	 */
	@Before(value="execution(* greeTo(..)) and args(clientName)",argNames="clientName")
	public void beforeGreeting(String clientName){
		logger.info("How are you..{}",clientName);
	}
}
