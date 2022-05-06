package com.poojeri.sachin.atg.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.poojeri.sachin.atg.model.InterestCalculator;

@Service("service")
public class CalculatorService {
	
	@Autowired
	@Qualifier(value = "sa")
	private InterestCalculator ic;
	
	

	public CalculatorService() {
		System.out.println("CalculatorService");
	}

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	public double service(double amount) {
		return ic.calculateInterest(amount);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initilized");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroyed");
	}
}
