
/*
 * Jesus Hernandez 614019
 * 9-22-16
 * Assignment 5 Question 1
 */
public class LongDistanceBill extends PhoneBill {
	private double callRate;
	
	public LongDistanceBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LongDistanceBill(double monthlyRate) {
		super(monthlyRate);
		// TODO Auto-generated constructor stub
	}
	
	public double getCallRate() {
		return callRate;
	}

	public void setCallRate(double callRate) {
		this.callRate = callRate;
	}

	@Override
	public double calculateBill(int minutesTalked) {
		// TODO Auto-generated method stub
		return ((callRate * minutesTalked) + getMonthlyRate());
	}

}
