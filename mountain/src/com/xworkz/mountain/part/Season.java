package com.xworkz.mountain.part;

public class Season {

	private String weather;
	private float temp;

	public Season(String weather, float temp) {
		super();
		this.weather = weather;
		this.temp = temp;
		System.out.println("Created Season with two args");
	}

	public Season(String weather) {
		this.weather = weather;
		System.out.println("Created season with one string arg");
	}
	public Season(float temp) {
		this.temp=temp;
		System.out.println("Created season with one float arg");
	}

	public void display() {
		System.out.println(weather);
		System.out.println(temp);
	}

}
