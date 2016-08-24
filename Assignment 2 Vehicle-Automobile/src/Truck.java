/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 2
 */
public class Truck extends Automobile {
	private double towCapacity;

	public Truck(int year, double weight, String licenseString, String make, double towCapacity) {
		super(year, weight, licenseString, make);
		this.towCapacity = towCapacity;
	}

	public Truck() {
		super();
	}

	/**
	 * @return the towCapacity
	 */
	public double getTowCapacity() {
		return towCapacity;
	}

	/**
	 * @param towCapacity
	 *            the towCapacity to set
	 */
	public void setTowCapacity(double towCapacity) {
		this.towCapacity = towCapacity;
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
				"\n\tTOW CAPACITY: " + getTowCapacity();
	}
}