package com.restaurant.model;

import org.springframework.stereotype.Component;

@Component("italy")
public class ItalianRestaurant implements Restaurant {

	@Override
	public String prepareFood(String dishName) {		
		return "Preparing Italian food "+dishName;
	}

}
