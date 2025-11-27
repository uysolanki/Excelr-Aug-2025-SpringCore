package com.excelr.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.model.Car;
import com.excelr.model.Engine;
import com.excelr.model.Gear;

public class DriverAppBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/mybeans.xml");
		System.out.println("Hiiii!!!");
		Engine engine1=(Engine)beanFactory.getBean("e1");
		System.out.println(engine1);
		
		Engine engine2=(Engine)beanFactory.getBean("e1");
		System.out.println(engine2);
		
		Engine engine3=(Engine)beanFactory.getBean("e1");
		System.out.println(engine3);
		System.out.println(engine1==engine2);
	}

}
