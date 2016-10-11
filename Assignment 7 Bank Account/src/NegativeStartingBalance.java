/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 1
 */

/**
 * NegativeStartingBalance exceptions are thrown by the BankAccount class when a
 * negative starting balance is passed to the constructor.
 */

@SuppressWarnings("serial")
public class NegativeStartingBalance extends Exception {
	/**
	 * This constructor uses a generic error message.
	 */

	public NegativeStartingBalance() {
		super("Error: Negative starting balance");
	}

	/**
	 * This constructor specifies the bad starting balance in the error message.
	 * 
	 * @param The
	 *            bad starting balance.
	 */

	public NegativeStartingBalance(double amount) {
		super("Error: Negative starting balance: " + amount);
	}
}
