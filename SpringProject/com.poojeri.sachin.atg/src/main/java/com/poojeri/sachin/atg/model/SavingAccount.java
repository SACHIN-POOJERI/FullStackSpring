package com.poojeri.sachin.atg.model;

import org.springframework.stereotype.Component;

@Component("sb")
public class SavingAccount implements InterestCalculator {

	private int duration;
	private double roi;
	
	
	public SavingAccount() {
		System.out.println("Saving Account");
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
		System.out.println("Saving Account calculateInterest");
		return amount * duration * roi /100;
	}

}
