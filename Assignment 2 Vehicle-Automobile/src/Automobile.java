/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 2
 */
public class Automobile extends Vehicle {
	private String licensePlate;
	private String make;

	public Automobile(int year, double weight, String licenseString, String make) {
		super(year, weight);
		this.licensePlate = licenseString;
		this.make = make;
	}

	public Automobile() {
		super();
		licensePlate ="unknown";
	}

	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}

	/**
	 * @param licensePlate
	 *            the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make
	 *            the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " YEAR: " + getYear() + 
			   " WEIGHT: " + getWeight() + 
			   " LICENSE PLATE: " + getLicensePlate() + 
			   " MAKE: " + getMake();
	}
}