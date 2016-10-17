
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
	private BOATSIZE size;

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
