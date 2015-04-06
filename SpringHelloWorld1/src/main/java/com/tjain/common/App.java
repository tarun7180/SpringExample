package com.tjain.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld obj = (HelloWorld)appContext.getBean("helloBean");
		obj.printHello();
	}

}
