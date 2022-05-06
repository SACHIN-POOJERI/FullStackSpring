package com.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.restaurant.model.Restaurant;

@Service("room")
public class RoomService {
	
	@Autowired
	@Qualifier(value ="italy")
	private Restaurant rs;
	
	
	public RoomService() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant getRs() {
		return rs;
	}

	public void setRs(Restaurant rs) {
		this.rs = rs;
	}
	
	public void takeOrderFromGuest(String dishName) {
		System.out.println(rs.prepareFood(dishName));
	}
	
	
}
