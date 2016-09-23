/*
 * Jesus Hernandez 614019
 * 9-22-16
 * Assignment 5 Question 1
 */
public abstract class PhoneBill {
	private double monthlyRate;

	public PhoneBill() {

	}

	public PhoneBill(double monthlyRate){
		this.monthlyRate = monthlyRate;
	}

	public double getMonthlyRate(){
		return monthlyRate;
	}
	
	

	public void setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public abstract double calculateBill(int time);
}
