package com.shangxin13lu.spring.helloworld.impl;

import com.shangxin13lu.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("Spring Say Hello!");
	}

}
