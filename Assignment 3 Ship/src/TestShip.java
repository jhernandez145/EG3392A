/*
 * Jesus Hernandez 614019
 * 9-9-16
 * Assignment 3 Question 1
 */
public class TestShip {
	public static void main(String[] args) {
		Ship[] shipArray = new Ship[3];
		
		shipArray[0] = new Ship("Triumph", "1960");
		shipArray[1] = new CruiseShip("Disney Magic", "1990", 2400);
		shipArray[2] = new CargoShip("Black Pearl", "2000", 50000);
		
		for(Ship shipObj : shipArray){
			System.out.println(shipObj.toString());
		}
	}
}
