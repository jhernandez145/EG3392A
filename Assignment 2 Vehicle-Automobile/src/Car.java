/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 2
 */
public class Car extends Automobile {
	private int maxPassengers;

	public Car(int year, double weight, String licenseString, String make, int maxPassengers) {
		super(year, weight, licenseString, make);
		this.maxPassengers = maxPassengers;
	}

	public Car() {
		super();
	}

	/**
	 * @return the maxPassengers
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}

	/**
	 * @param maxPassengers
	 *            the maxPassengers to set
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  "\n\tTYPE: " + getClass().getName() + "\n" +
				"\tYEAR: " + getYear() + 
				"\n\tWEIGHT: " + getWeight() + 
				"\n\tLICENSE PLATE: " + getLicensePlate() + 
				"\n\tMAKE: " + getMake() + 
				"\n\tMAX PASSENGERS: " + getMaxPassengers();
	}
}