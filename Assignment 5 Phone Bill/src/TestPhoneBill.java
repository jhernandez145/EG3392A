/*
 * Jesus Hernandez 614019
 * 9-22-16
 * Assignment 5 Question 1
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class TestPhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		LongDistanceBill ldBill = new LongDistanceBill();
		
		double callRate, monthlyRate; 
		int minutesTalked;
		
		System.out.println("This program will calculate your phone bill for you");
		
		System.out.println("What is your phone rate?");
		callRate = input.nextDouble();
		
		System.out.println("What is your monthly rate?");
		monthlyRate = input.nextDouble();
		
		System.out.println("How manu minutes did you talk?");
		minutesTalked = input.nextInt();
		
		ldBill.setCallRate(callRate);
		ldBill.setMonthlyRate(monthlyRate);
		System.out.println("Your monthly bill is " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(ldBill.calculateBill(minutesTalked)));
		
	}

}
