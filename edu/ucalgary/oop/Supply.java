/**
 * @author  Sabrina Li <a href="mailto:sabrina.li1@ucalgary.ca">
 *          sabrina.li1@ucalgary.ca</a>
 * @version 1.0
 * @since   1.0
*/

package edu.ucalgary.oop;

/**
 * Supply is a class that helps keep track of the available supplies each Location has.
 * It is also used to keep track of what supplies each DisasterVictim has been given.
*/

public class Supply {
	private String type;
	private int quantity;
	
	//getters
	public String getType() {
		return this.type;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	//setters
	public void setType(String type) {
		this.type = type;
	}
	
	public void setQuantity(int quantity) {
		//(negative quantity case?)----------------
		this.quantity = quantity;
	}
	
	//constructors
	public Supply(String type, int quantity) {
		this.type = type;
		this.quantity = quantity;
	}
}
