/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 2
 */
public class Vehicle {
	private int year;
	private double weight;

	public Vehicle(int year, double weight) {
		super();
		this.year = year;
		this.weight = weight;
	}

	public Vehicle() {
		weight = 2000.00;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n\tTYPE: " + getClass().getName() +
			   "\n\tYEAR: " + getYear() +
			   "\n\tWEIGHT: " + getWeight();
	}

}