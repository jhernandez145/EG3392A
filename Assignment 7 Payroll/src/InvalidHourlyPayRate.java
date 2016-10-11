/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 2
 */

/**
 * InvalidHourlyPayRate exceptions are thrown by Payroll class when an hourly
 * pay rate greater than 25 $/Hour is passed to the method
 * {@link src.Payroll.setHourlyPayRate}.
 */
public class InvalidHourlyPayRate extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidHourlyPayRate() {
		super("Cannot have an hourly pay rate greater then 25!");
	}

	public InvalidHourlyPayRate(double hourlyPayRate) {
		super("Cannot have an hourly rate greater then 25, hourly pay rate input: " + hourlyPayRate + "!");
	}
}
