/*
 * Jesus Hernandez 614019
 * 9-9-16
 * Assignment 3 Question 1
 */
public class Ship {
	private String name;
	private String yearBuilt;
	
	
	public Ship() {
		
	}
	public Ship(String name, String yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	
	@Override
	public String toString() {
		return "Name: " + name +"\n" +
			   "Year Built: " + yearBuilt + "\n" + 
			   "----------------------------";
	}		
}
