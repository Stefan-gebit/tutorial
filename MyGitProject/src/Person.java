import java.util.ArrayList;
import java.util.List;

/**
 * Person entity
 * @author SLemke
 * @email stefan.lemke@gebti.de
 *
 */
public class Person {

	private List<Boat> boats = new ArrayList();
	public void say(String somthing){
		
		System.out.println(somthing);
	}
	
	public int myAgeIs(){
		return 14;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public String myAddressIs(){
		return "Dallgow-D�beritz";	
	}
	
	public void addBoat(Boat boat){
		boats.add(boat);
	}
}
