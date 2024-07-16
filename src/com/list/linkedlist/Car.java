package com.list.linkedlist;

public class Car {

	private String car_colour;
	private int price;
	private int model;
	public String getCar_colour() {
		return car_colour;
	}
	public void setCar_colour(String car_colour) {
		this.car_colour = car_colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public Car(String car_colour, int price, int model) {
		super();
		this.car_colour = car_colour;
		this.price = price;
		this.model = model;
	}
	

}
