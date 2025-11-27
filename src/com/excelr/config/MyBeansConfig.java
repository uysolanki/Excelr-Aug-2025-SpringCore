package com.excelr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.excelr.model.Car;
import com.excelr.model.Engine;
import com.excelr.model.Gear;

@Configuration
@ComponentScan(basePackages = "com.excelr.model")
public class MyBeansConfig {

	@Bean(name = "e1")
	@Scope("prototype")
	public Engine getEngineByCDI()
	{
		return new Engine(3000,30,"Petrol","Honda");
	}
	
	@Bean(name = "e2")
	public Engine getEngineBySDI()
	{
		Engine engine=new Engine();
		engine.setEngineCC(4000);
		engine.setEngineLiter(40);
		engine.setEngineMfg("Volvo");
		engine.setEngineType("Diesel");
		return engine;
	}
	
	@Bean(name = "g1")
	@Scope("prototype")
	public Gear getGearByCDI()
	{
		return new Gear(16,"Automatic","Mahindra");
	}
	
	@Bean(name = "g2")
	public Gear getGearBySDI()
	{
		Gear gear=new Gear();
		gear.setGearLever(18);
		gear.setGearMfg("Tata");
		gear.setGearType("Manual");
		return gear;
	}
	
	
	@Bean(name = "c1")
	public Car getCarByCDI()
	{
		Car car=new Car("Fortuner","Toyota",1200.0,"Black");
		return car;
	}
}
