/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 2
 */

/**
 * InvalidHoursWorkedInWeek exceptions are thrown by Payroll class when the
 * hours worked in the week passed to the method
 * {@link src.Payroll#setHoursWorkedInWeek} is greater than 84
 */
public class InvalidHoursWorkedInWeek extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidHoursWorkedInWeek() {
		super("Cannot have worked less than 0 or more than 84 hours worked in week!");
	}

	public InvalidHoursWorkedInWeek(double hoursWorkedInWeek) {
		super("Cannot have worked less than 0 or more than 84 hours per week, hours worked in week input: "
				+ hoursWorkedInWeek + "!");
	}
}
