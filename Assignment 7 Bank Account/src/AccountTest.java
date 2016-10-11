/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 1
 */

/**
 * This program demonstrates how the BankAccount class constructor throws custom
 * exceptions.
 */

public class AccountTest {
	public static void main(String[] args) {
		// Force a NegativeStartingBalance exception.
		try {
			@SuppressWarnings("unused")
			BankAccount account = new BankAccount(-100.00, 100.00);
		} catch (NegativeStartingBalance | NegativeInterestRate e) {
			System.out.println(e.getMessage());
		}

		try {
			@SuppressWarnings("unused")
			BankAccount account2 = new BankAccount(100.00, -100.00);
		} catch (NegativeInterestRate | NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		}
	}
}