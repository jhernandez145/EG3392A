/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 2
 */

/**
 * InvalidEmployeeNumberID exceptions are thrown by Payroll class when an
 * non-integer or a negative employee ID number is passed to the constructor.
 */
public class InvalidEmployeeNumberID extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeNumberID() {
		super("Cannot have negative || non-integer employee ID number!");
	}

	public InvalidEmployeeNumberID(int numberID) {
		super("Cannot have negative employee ID number, number ID input: " + numberID + "!");
	}

	public InvalidEmployeeNumberID(double numberID) {
		super("Cannot have integer employee ID number, number ID input: " + numberID + "!");
	}
}
