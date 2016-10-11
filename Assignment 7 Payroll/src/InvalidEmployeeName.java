/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 2
 */

/**
 * InvalidEmployeeName exceptions are thrown by Payroll class when an empty
 * string for the name is passed to the constructor.
 */

public class InvalidEmployeeName extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeName() {
		super("Cannot have empty string as employee name!");
	}
}
