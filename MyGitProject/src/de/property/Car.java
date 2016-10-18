package de.property;
import de.person.Person;
/**
 * this is a car
 * @author SLemke
 *
 */
public class Car {

	private Person owner;

	public Car(Person owner){
		this.owner = owner;
	}
	
	public Person getOwner(){
		return owner;
	}
}
