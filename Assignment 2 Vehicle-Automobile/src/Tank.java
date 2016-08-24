/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 2
 */
public class Tank extends Vehicle {
	private double armorWidth;

	public Tank(int year, double weight, double armorWidth) {
		super(year, weight);
		this.armorWidth = armorWidth;
		// TODO Auto-generated constructor stub
	}

	public Tank() {
		super();
	}

	/**
	 * @return the armorWidth
	 */
	public double getArmorWidth() {
		return armorWidth;
	}

	/**
	 * @param armorWidth
	 *            the armorWidth to set
	 */
	public void setArmorWidth(double armorWidth) {
		this.armorWidth = armorWidth;
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
			   "\n\tWEIGHT: " + getWeight() + 
			   "\n\tARMOR WIDTH: " + getArmorWidth();
	}
}