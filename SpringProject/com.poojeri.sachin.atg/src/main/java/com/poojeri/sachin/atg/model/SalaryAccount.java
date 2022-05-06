package com.poojeri.sachin.atg.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sa")
public class SalaryAccount implements InterestCalculator {
	
	@Value(value = "4.5")
	private double roi;

	@Value(value = "4")
	private int duration;
	
	

	public SalaryAccount() {
		System.out.println("Salary Account");
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
		System.out.println("Salary Account calculateInterest");
		return amount * duration * roi /100;
	}

}
