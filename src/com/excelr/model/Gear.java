package com.excelr.model;

public class Gear {

	private int gearLever;
	private String gearType;
	private String gearMfg;
	
	public Gear() {}
	public Gear(int gearLever, String gearType, String gearMfg) {
		this.gearLever = gearLever;
		this.gearType = gearType;
		this.gearMfg = gearMfg;
	}
	public int getGearLever() {
		return gearLever;
	}
	public void setGearLever(int gearLever) {
		this.gearLever = gearLever;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getGearMfg() {
		return gearMfg;
	}
	public void setGearMfg(String gearMfg) {
		this.gearMfg = gearMfg;
	}
	
	@Override
	public String toString() {
		return "Gear [gearLever=" + gearLever + ", gearType=" + gearType + ", gearMfg=" + gearMfg + "]";
	}
	
	
}
