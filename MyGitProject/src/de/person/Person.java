package de.person;
import java.util.ArrayList;
import java.util.List;

import de.property.Boat;
import de.property.Car;

/**
 * Person entity
 * @author SLemke
 * @email stefan.lemke@gebti.de
 *
 */
public class Person {

	private List<Car> cars = new ArrayList();
	
	private List<Boat> boats = new ArrayList();

	public void say(String somthing){
		
		System.out.println(somthing);
	}
	
	public int myAgeIs(){
		return 14;
		
	}
	
	public void addCar(Car newCar){
		cars.add(newCar);
	}
	/**
	 * 
	 * @return
	 */
	public String myAddressIs(){
		return "Dallgow-Döberitz";	
	}
	
	public void addBoat(Boat boat){
		boats.add(boat);
	}
}
