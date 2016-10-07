/*
 * Jesus Hernandez 614019
 * 10-06-16
 * Assignment 6 Question 1
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		double numerator = 0.0;
		double denominator = 0.0;
		
		try{
		System.out.print("Numerator: ");
		numerator = input.nextDouble();
		
		System.out.print("Denominator: ");
		denominator = input.nextDouble();
		}
		//Does not want to execute my code. Prints exception message and does not allow to input again.
		//TODO Find out how to ask for input again.
		catch(InputMismatchException e){
			System.out.println("InputMismatchException!");
			System.out.println("Please re-enter numbers.");
			
			System.out.print("Numerator: ");
			numerator = input.nextDouble();
			
			System.out.print("Denominator: ");
			denominator = input.nextDouble();
		}
		System.out.println(numerator + "/" + denominator + " = " + divide(numerator, denominator));
		input.close();
	
	}
	public static double divide(double numerator, double denominator){
		if(denominator == 0){
			throw new ArithmeticException("Division by zero! Cannot do!");
		}
		return (numerator / denominator);		
	}
}
