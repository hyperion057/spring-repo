package com.spring.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"Bean.xml");
		ClassOne Object = (ClassOne) context.getBean("testId3");
		Object.getMessage();
		context.registerShutdownHook();
	}

}
