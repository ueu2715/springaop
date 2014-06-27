package com.sx.springaop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sx.springaop.service.interf.Waiter;

public class NaiveWaiter implements Waiter{
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	public void greeTo(String clientName){
		logger.info("NaiveWaiter.gree to {}",clientName);
	}
	
	public void serveTo(String clientName){
		logger.info("NaiveWaiter.serve to {}",clientName);
	}
}
