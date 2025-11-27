package com.excelr.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.model.Car;
import com.excelr.model.Engine;
import com.excelr.model.Gear;

public class DriverAppAutowire {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/mybeans.xml");

		Car car1=beanFactory.getBean("c2",Car.class);
		System.out.println(car1);
	}

}
