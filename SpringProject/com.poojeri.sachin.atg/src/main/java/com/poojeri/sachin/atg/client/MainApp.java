package com.poojeri.sachin.atg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poojeri.sachin.atg.service.CalculatorService;

public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext  ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		CalculatorService cs = (CalculatorService) ctx.getBean("service");
		System.out.println(cs.service(10201));
		ctx.close();

	}

}
