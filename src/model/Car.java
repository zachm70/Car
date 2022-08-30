/**  
* @author Zach Meyer - zjmeyer  
* CIS175 - Spring 2022
* Aug 26, 2022  
*/
package model;

import java.time.LocalDate;

public class Car {
	private String model;
	private String make;
	private String color;
	private int year;
	private int miles;
	
	public Car(String model, String make, String color, int year) {
		this.model = model;
		this.make = make;
		this.color = color;
		this.year = year;
	}

	public Car() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String print() {
		return color+ " " + year + " " + make + " " + model;
	}
	
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public int findAge() {
		LocalDate date1 = LocalDate.of(year, 1, 1);
		LocalDate date2 = LocalDate.now();
		
		return date2.getYear()-date1.getYear();
	}
	
	public boolean needsOilChange() {
		if(miles >= 50000) {
			return true;
		} else {
			return false;
		}
	}
}