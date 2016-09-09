/*
 * Jesus Hernandez 614019
 * 9-9-16
 * Assignment 3 Question 1
 */
public class CargoShip extends Ship {
	private int cargoCapacity;
	
	
	public CargoShip() {
		// TODO Auto-generated constructor stub
	}
	public CargoShip(String name, String yearBuilt, int cargoCapacity) {
		super(name, yearBuilt);
		this.cargoCapacity = cargoCapacity;
	}
	
	
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	@Override
	public String toString() {
		return "Name: " + getName() +"\n" +
			   "Cargo Capacity: " + cargoCapacity + "\n" + 
		       "----------------------------";
	}

}
