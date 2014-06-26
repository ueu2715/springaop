package com.sx.springaop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sx.springaop.anno.NeedTest;

public class TestAnnoService {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@NeedTest(true)
	public void deleteForum(int id){
		logger.info("ɾ��ģ��:{}",id);
	}
	
	@NeedTest(false)
	public void deleteTopic(int id){
		logger.info("ɾ������:{}", id);
	}
	
	public void testObj(int id){
		logger.info("����ɾ����ɾ��id:{}",id);
	}
}
