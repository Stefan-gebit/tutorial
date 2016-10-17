
/**
 * this is a boat
 * @author SLemke
 *
 */
public class Boat {
	/**
	 * 
	 * @author SLemke
	 *
	 */
	public enum BOATSIZE {LARGE, MEDIUM , SMALL}
	
	private Person person;
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	private BOATSIZE size;
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Boat(Person person){
		this.person = person;
	}
	
	public void setSize(BOATSIZE size){
		this.size = size;		
	}
	
	public BOATSIZE getSize(){
		return size;		
	}
	
	
}
