package com.excelr.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.model.Player;

public class DriverAppBeanLC {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/mybeans.xml");

		System.out.println("Hii!!!");
		Player player1=beanFactory.getBean("p1",Player.class);
		System.out.println(player1);
		
		beanFactory.registerShutdownHook();
	}

}
