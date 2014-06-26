package com.sx.springaop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sx.springaop.anno.NeedTest;

public class TestAnnoService {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@NeedTest(true)
	public void deleteForum(int id){
		logger.info("É¾³ýÄ£¿é:{}",id);
	}
	
	@NeedTest(false)
	public void deleteTopic(int id){
		logger.info("É¾³ýÖ÷Ìâ:{}", id);
	}
	
	public void testObj(int id){
		logger.info("²âÊÔÉ¾³ý£¬É¾³ýid:{}",id);
	}
}
