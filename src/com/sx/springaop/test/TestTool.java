package com.sx.springaop.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sx.springaop.anno.NeedTest;
import com.sx.springaop.service.TestAnnoService;

public class TestTool {
	private static final Logger logger = LoggerFactory.getLogger(TestTool.class);
	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws InstantiationException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException, SecurityException, NoSuchMethodException {
		// TODO Auto-generated method stub
		int id = 1;
		Class<TestAnnoService> clazz = TestAnnoService.class;
		TestAnnoService tas = clazz.newInstance();
		Method testMethod = clazz.getDeclaredMethod("testObj", int.class);
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods){
			NeedTest nt = m.getAnnotation(NeedTest.class);
			if(nt != null){
				boolean flag = nt.value();
				if(flag){
					logger.info("method {} 需要测试",m.getName());
					testMethod.invoke(tas, id);
				}else{
					logger.info("method {} 不需要测试",m.getName());
				}
				m.invoke(tas, id);
			}
		}
		
	}

}
