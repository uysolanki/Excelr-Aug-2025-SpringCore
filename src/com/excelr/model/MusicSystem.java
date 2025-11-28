package com.excelr.model;

public class MusicSystem {
	private String modelName;
	private String mfgName;
	private double price;
	
	public MusicSystem() {}
	public MusicSystem(String modelName, String mfgName, double price) {
		this.modelName = modelName;
		this.mfgName = mfgName;
		this.price = price;
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
	@Override
	public String toString() {
		return "MusicSystem [modelName=" + modelName + ", mfgName=" + mfgName + ", price=" + price + "]";
	}
	
	
}
