package com.excelr.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excelr.config.MyBeansConfig;
import com.excelr.model.Car;
import com.excelr.model.Engine;
import com.excelr.model.Player;

public class DriverAppJavaBasedBeans {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyBeansConfig.class);
//
//		Engine engine1=beanFactory.getBean("e1",Engine.class);
//		System.out.println(engine1);
//		
//		Engine engine2=beanFactory.getBean("e1",Engine.class);
//		System.out.println(engine1);
//		
//		System.out.println(engine1==engine2);
//		
//		Engine engine3=beanFactory.getBean("e2",Engine.class);
//		System.out.println(engine3);
		
		
//		Car car1=beanFactory.getBean("c1",Car.class);
//		System.out.println(car1);
		
//		Player player1=beanFactory.getBean(Player.class);
//		System.out.println(player1);
		
		
		Car car1=beanFactory.getBean("getCarFromProperties",Car.class);
		System.out.println(car1);
	}

}
