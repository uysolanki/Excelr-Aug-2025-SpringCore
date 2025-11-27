package com.excelr.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
		private String modelName;
		private String mfgName;
		private double price;
		private String color;
		
		@Autowired			//ByType
		@Qualifier("e1")
		Engine engine;		//HAS-A  Dependency
		
		@Autowired			//ByType
		@Qualifier("g1")
		Gear gear;			//HAS-A  Dependency
		
		public Car() {}
		
		//Constructor Dependency Injection CDI
		public Car(String modelName, String mfgName, double price, String color, Engine engine, Gear gear) {
			this.modelName = modelName;
			this.mfgName = mfgName;
			this.price = price;
			this.color = color;
			this.engine = engine;
			this.gear = gear;
		}
		
		public Car(String modelName, String mfgName, double price, String color) {
			this.modelName = modelName;
			this.mfgName = mfgName;
			this.price = price;
			this.color = color;
		}

		public String getModelName() {
			return modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getMfgName() {
			return mfgName;
		}

		public void setMfgName(String mfgName) {
			this.mfgName = mfgName;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Engine getEngine() {
			return engine;
		}

		//SDI - Setter Dependency Injection
		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		public Gear getGear() {
			return gear;
		}

		//SDI - Setter Dependency Injection
		public void setGear(Gear gear) {
			this.gear = gear;
		}

		@Override
		public String toString() {
			return "Car [modelName=" + modelName + ", mfgName=" + mfgName + ", price=" + price + ", color=" + color
					+ ", engine=" + engine + ", gear=" + gear + "]";
		}
		
		
		
}
