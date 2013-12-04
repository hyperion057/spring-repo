package com.spring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass {
	public static void main(String[] arg){
		ApplicationContext context;
		context= new ClassPathXmlApplicationContext("Bean.xml");
		ClassOne ObjectOne=(ClassOne)context.getBean("testId2");
		ObjectOne.setMessage("Test Message One");
		ObjectOne.getMessage();
		ClassOne ObjectTwo= (ClassOne)context.getBean("testId2");
		ObjectTwo.getMessage();
	}

}
