package com.restaurant.model;

import org.springframework.stereotype.Component;

@Component("india")
public class IndianRestaurant implements Restaurant {

	@Override
	public String prepareFood(String dishName) {
		return "Prparing Indian Food "+dishName;
	}

}
