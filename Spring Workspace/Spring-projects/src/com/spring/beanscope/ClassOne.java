package com.spring.beanscope;

public class ClassOne {
	private String messageBuffer;
	public void setMessage(String incomingMessage){
		this.messageBuffer=incomingMessage;
	}
	public void getMessage(){
		System.out.println("Test Message: "+messageBuffer);
	}

}
