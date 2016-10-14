import java.util.ArrayList;
import java.util.List;

/**
 * Person entity
 * @author SLemke
 * @email stefan.lemke@gebti.de
 *
 */
public class Person {
	private List<Car> cars = new ArrayList();
	
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
	
}
