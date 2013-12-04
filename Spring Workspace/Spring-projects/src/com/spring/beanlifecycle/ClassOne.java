package com.spring.beanlifecycle;

public class ClassOne {
	private String messageBuffer;

	public void setMessage(String incomingMessage) {
		this.messageBuffer = incomingMessage;
	}

	public void getMessage() {
		System.out.println("In Between Init & Destroy");
	}

	public void init() {
		System.out.println("Bean Initializing....");
	}

	public void destroy() {
		System.out.println("Bean Destoryed !!!");
	}
}
