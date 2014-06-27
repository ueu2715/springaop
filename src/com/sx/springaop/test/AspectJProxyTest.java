package com.sx.springaop.test;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sx.springaop.advice.PreGreetingAspect;
import com.sx.springaop.service.NaiveWaiter;
import com.sx.springaop.service.interf.Waiter;

public class AspectJProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Waiter target = new NaiveWaiter();
		AspectJProxyFactory factory = new AspectJProxyFactory();
		factory.setTarget(target);
		factory.addAspect(PreGreetingAspect.class);
		Waiter proxy = factory.getProxy();
		proxy.greeTo("John");
		proxy.serveTo("John");*/
		String configLocation = "com/sx/springaop/test/aspectjtest.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);
		Waiter waiter = (Waiter) ctx.getBean("waiter");
		waiter.greeTo("Jhon");
		waiter.serveTo("Jhon");
	}

}
