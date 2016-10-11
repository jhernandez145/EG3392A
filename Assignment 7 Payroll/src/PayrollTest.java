/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 2
 */

/**
 * This program demonstrates how the Payroll class constructor throws custom
 * exceptions.
 */

public class PayrollTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("These employees have incorrect values:\n");
		try {
			Payroll employee0 = new Payroll("", 123);
		} catch (InvalidEmployeeName | InvalidEmployeeNumberID e) {
			System.out.println(e.getMessage());
		}

		try {
			Payroll employee1 = new Payroll("John Smith", -123);
		} catch (InvalidEmployeeName | InvalidEmployeeNumberID e) {
			System.out.println(e.getMessage());
		}

		try {
			Payroll employee2 = new Payroll("John Smith", 123.321);
		} catch (InvalidEmployeeName | InvalidEmployeeNumberID e) {
			System.out.println(e.getMessage());
		}

		try {
			Payroll employee3 = new Payroll("John Smith", 123);
			employee3.setHourlyPayRate(26);
		} catch (InvalidEmployeeName | InvalidEmployeeNumberID | InvalidHourlyPayRate e) {
			System.out.println(e.getMessage());
		}
		try {
			Payroll employee4 = new Payroll("John Smith", 123);
			employee4.setHoursWorkedInWeek(85);
		} catch (InvalidEmployeeName | InvalidEmployeeNumberID | InvalidHoursWorkedInWeek e) {
			System.out.println(e.getMessage());
		}

		try {
			Payroll employee5 = new Payroll("John Smith", 123);
			employee5.setHourlyPayRate(10.0);
			employee5.setHoursWorkedInWeek(40);
			System.out.println("\nThis employee has correct values:\n");
			System.out.println(employee5.toString());
		} catch (InvalidEmployeeName | InvalidEmployeeNumberID | InvalidHourlyPayRate | InvalidHoursWorkedInWeek e) {
			System.out.println(e.getMessage());
		}

	}
}
