package com.abhishek.springProject;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	/*public Tyre(String brand) {
		super();
		this.brand = brand;
	}*/

	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre is working";
	}
	
}
