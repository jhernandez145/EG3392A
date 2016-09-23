
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
