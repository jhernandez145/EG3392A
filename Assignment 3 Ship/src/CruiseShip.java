/*
 * Jesus Hernandez 614019
 * 9-9-16
 * Assignment 3 Question 1
 */
public class CruiseShip extends Ship {
	private int maxPassengers;

	
	public CruiseShip() {
		super();
	}
	public CruiseShip(String name, String yearBuilt, int maxPassengers){
		super(name, yearBuilt);
		this.maxPassengers = maxPassengers;
	}
	
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	@Override
	public String toString() {
		return "Name: " + getName() +"\n" +
			   "Maximum Passengers: " + maxPassengers + "\n" + 
			   "----------------------------";
	}
	
}
