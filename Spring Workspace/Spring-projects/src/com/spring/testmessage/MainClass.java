package com.spring.testmessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] arg) {
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("Bean.xml");
		ClassOne objectOne = (ClassOne) context.getBean("testId");
		objectOne.getMessage();
	}
}
