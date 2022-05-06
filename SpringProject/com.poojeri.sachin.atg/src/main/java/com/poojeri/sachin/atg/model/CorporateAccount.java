package com.poojeri.sachin.atg.model;

import org.springframework.stereotype.Component;

@Component("ca")
public class CorporateAccount implements InterestCalculator {

	private double roi;
	private int duration;
	
	

	public CorporateAccount() {
		System.out.println("Corporate Account");
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(int roi) {
		this.roi = roi;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public double calculateInterest(double amount) {
		System.out.println("Corporate Account calculateInterest");
		return amount * duration * roi /100;
	}

}
