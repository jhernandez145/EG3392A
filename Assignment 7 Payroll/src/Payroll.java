/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 2
 */

/**
 * @author Jesus Hernandez * The Payroll class simulates a payroll account
 */
public class Payroll {
	private String name;
	private int numberID;
	private double hourlyPayRate;
	private double hoursWorkedInWeek;

	/**
	 * This constructor does not set any values.
	 */
	public Payroll() {
		super();
	}

	/**
	 * This constructor sets the employee name and ID number to the values
	 * passed as arguments.
	 * 
	 * @param name
	 *            The employee's name.
	 * @param numberID
	 *            The employee's ID number.
	 * @throws InvalidEmployeeName
	 *             Empty string for employee name passed as argument.
	 * @throws InvalidEmployeeNumberID
	 *             Negative integer for employee ID number passed as argument
	 */
	public Payroll(String name, int numberID) throws InvalidEmployeeName, InvalidEmployeeNumberID {
		super();
		if (name == "") {
			throw new InvalidEmployeeName();
		} else if (numberID < 0 | numberID % 1 != 0) {
			// If numberID is less than zero, or a non-integer value
			throw new InvalidEmployeeNumberID(numberID);
		}
		this.name = name;
		this.numberID = numberID;
	}

	/**
	 * This constructor sets the employee name and ID number to the values
	 * passed as arguments. This always throws an exception as an ID number
	 * cannot be a double.
	 * 
	 * @param name
	 *            The employee's name.
	 * @param numberID
	 *            The employee's ID number.
	 * @throws InvalidEmployeeName
	 *             Empty string for employee name passed as argument.
	 * @throws InvalidEmployeeNumberID
	 *             Non-integer integer for employee ID number passed as
	 *             argument.
	 */
	public Payroll(String name, double numberID) throws InvalidEmployeeName, InvalidEmployeeNumberID {
		if (name == "") {
			throw new InvalidEmployeeName();
		} else if (numberID < 0 | numberID % 1 != 0) {
			// If numberID is less than zero, or a non-integer value
			throw new InvalidEmployeeNumberID(numberID);
		}
	}

	/**
	 * @return Employee name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name of the employee to set.
	 * @throws InvalidEmployeeName
	 *             Empty string for employee name passed as argument.
	 */
	public void setName(String name) throws InvalidEmployeeName {
		if (name == "") {
			throw new InvalidEmployeeName();
		} else {
			this.name = name;
		}

	}

	/**
	 * @return Employee number ID.
	 */
	public int getNumberID() {
		return numberID;
	}

	/**
	 * @param numberID
	 *            The employee number ID to set.
	 * @throws InvalidEmployeeNumberID
	 *             Negative integer for employee ID number passed as argument.
	 */
	public void setNumberID(int numberID) throws InvalidEmployeeNumberID {
		if (numberID < 0 | numberID % 1 != 0) {
			// If numberID is less than zero, or a non-integer value
			throw new InvalidEmployeeNumberID(numberID);
		} else {
			this.numberID = numberID;
		}

	}

	/**
	 * @return The hourly pay rate of the employee.
	 */
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	/**
	 * @param hourlyPayRate
	 *            The hourly pay rate of the employee to set.
	 * @throws InvalidHourlyPayRate
	 *             The hourly pay rate exceeds 25 $/Hour.
	 */
	public void setHourlyPayRate(double hourlyPayRate) throws InvalidHourlyPayRate {
		if (hourlyPayRate > 25) {
			throw new InvalidHourlyPayRate(hourlyPayRate);
		}
		this.hourlyPayRate = hourlyPayRate;
	}

	/**
	 * @return The hours worked in the week by the employee.
	 */
	public double getHoursWorkedInWeek() {
		return hoursWorkedInWeek;
	}

	/**
	 * @param hoursWorkedInWeek
	 *            The hours worked in the week by the employee to set.
	 * @throws InvalidHoursWorkedInWeek
	 *             The hours/week exceeds 85 hours.
	 */
	public void setHoursWorkedInWeek(double hoursWorkedInWeek) throws InvalidHoursWorkedInWeek {
		if (hoursWorkedInWeek > 84) {
			throw new InvalidHoursWorkedInWeek(hoursWorkedInWeek);
		} else {
			this.hoursWorkedInWeek = hoursWorkedInWeek;
		}
	}

	/**
	 * 
	 * @return the gross pay of the employee for that week
	 */
	public double getGrossPay() {
		return (hoursWorkedInWeek * hourlyPayRate);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Payroll:Name = " + name + "\n\tNumber ID = " + numberID + "\n\tHourly Pay Rate = " + hourlyPayRate
				+ "\n\tHours Worked In Week = " + hoursWorkedInWeek + "\n\tGross Pay = " + getGrossPay();
	}

}
