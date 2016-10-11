/*
 * Jesus Hernandez 614019
 * 10-12-16
 * Assignment 7 Question 1
 */

/**
 * The BankAccount class simulates a bank account.
 */

public class BankAccount {
	private double balance; // Account balance
	private double interestRate;

	/**
	 * This constructor sets the starting balance at 0.0.
	 */

	public BankAccount() {
		balance = 0.0;
	}

	/**
	 * This constructor sets the starting balance to the value passed as an
	 * argument.
	 * 
	 * @param startBalance
	 *            The starting balance.
	 * @throws NegativeStartingBalance
	 */

	public BankAccount(double startBalance) throws NegativeStartingBalance {
		if (startBalance < 0) {
			throw new NegativeStartingBalance(startBalance);
		} else {
			balance = startBalance;
		}

	}

	public BankAccount(double startBalance, double interestRate) throws NegativeStartingBalance, NegativeInterestRate {
		if (startBalance < 0) {
			throw new NegativeStartingBalance(startBalance);
		} else if (interestRate < 0) {
			throw new NegativeInterestRate(interestRate);
		} else {
			balance = startBalance;
			this.setInterestRate(interestRate);
		}
	}

	/**
	 * This constructor sets the starting balance to the value in the String
	 * argument.
	 * 
	 * @param str
	 *            The starting balance, as a String.
	 */

	public BankAccount(String str) {
		balance = Double.parseDouble(str);
	}

	/**
	 * The deposit method makes a deposit into the account.
	 * 
	 * @param amount
	 *            The amount to add to the balance field.
	 */

	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * The deposit method makes a deposit into the account.
	 * 
	 * @param str
	 *            The amount to add to the balance field, as a String.
	 */

	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}

	/**
	 * The withdraw method withdraws an amount from the account.
	 * 
	 * @param amount
	 *            The amount to subtract from the balance field.
	 */

	public void withdraw(double amount) {
		balance -= amount;
	}

	/**
	 * The withdraw method withdraws an amount from the account.
	 * 
	 * @param str
	 *            The amount to subtract from the balance field, as a String.
	 */

	public void withdraw(String str) {
		balance -= Double.parseDouble(str);
	}

	/**
	 * The setBalance method sets the account balance.
	 * 
	 * @param b
	 *            The value to store in the balance field.
	 */

	public void setBalance(double b) {
		balance = b;
	}

	/**
	 * The setBalance method sets the account balance.
	 * 
	 * @param str
	 *            The value, as a String, to store in the balance field.
	 */

	public void setBalance(String str) {
		balance = Double.parseDouble(str);
	}

	/**
	 * The getBalance method returns the account balance.
	 * 
	 * @return The value in the balance field.
	 */

	public double getBalance() {
		return balance;
	}

	/**
	 * The getInterestRate method returns the account interest rate.
	 * 
	 * @return The value in the interestRate field.
	 */

	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * The setInterest method sets the account interest rate.
	 * 
	 * @param interestRate
	 *            The value, as a Double, to store in the interestRate field.
	 */

	public void setInterestRate(double interestRate) throws NegativeInterestRate {
		if (interestRate < 0) {
			throw new NegativeInterestRate(interestRate);
		} else {
			this.interestRate = interestRate;
		}

	}
}
