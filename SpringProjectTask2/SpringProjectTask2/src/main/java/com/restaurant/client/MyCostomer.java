package com.restaurant.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.restaurant.service.RoomService;

public class MyCostomer {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		RoomService cs = (RoomService) ctx.getBean("room");
		
		cs.takeOrderFromGuest("Idli");
		
		ctx.close();

	}

}
