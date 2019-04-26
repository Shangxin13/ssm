package com.shangxin13lu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shangxin13lu.spring.helloworld.HelloWorldService;
import com.shangxin13lu.spring.helloworld.HelloWorld;

public class HelloProgram {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		HelloWorld helloWorld = service.getHelloWorld();
		helloWorld.sayHello();
	}
}
