package de.property;

import de.person.Person;

/**
 * New Feature Garden
 * 
 * @author SLemke
 *
 */
public class Garden {
	
	private int area;
	private Person person;
	
	public Garden(Person person){
		this.person = person;
	}
	
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	
	
	
	
}
