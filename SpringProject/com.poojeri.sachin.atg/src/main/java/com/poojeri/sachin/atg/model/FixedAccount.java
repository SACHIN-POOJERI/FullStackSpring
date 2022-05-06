package com.poojeri.sachin.atg.model;

import org.springframework.stereotype.Component;

@Component("fd")
public class FixedAccount implements InterestCalculator {
	private int duration;
	private double roi;
	
	
	public FixedAccount() {
		System.out.println("FixedAccount");
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	@Override
	public double calculateInterest(double amount) {
		System.out.println("FixedAccount calculateInterest");
		return amount * duration * roi /100;
	}
	
}
