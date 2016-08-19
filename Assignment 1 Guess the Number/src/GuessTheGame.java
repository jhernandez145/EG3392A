/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 1 Question 2
 */
import java.util.Scanner;
public class GuessTheGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;
		int generatedNumber;
		int tryCounter = 0;
		
		System.out.print("Enter an integer in the range 1 to 1000: ");
		userInput = input.nextInt();
		tryCounter++;
		
		generatedNumber = (int) (Math.random() * 1000);
		
		if(userInput != generatedNumber){
			while(userInput != generatedNumber){
				if(userInput < generatedNumber){
					System.out.print("Too low. Enter another number: ");
					userInput = input.nextInt();
					tryCounter++;
				}
				if(userInput > generatedNumber){
					System.out.print("Too high. Enter another number: ");
					userInput = input.nextInt();
					tryCounter++;
				}
			}
		}
		
		input.close();
		
		if(userInput == generatedNumber){
			if(tryCounter == 1){
				System.out.println("Congratulations! You guessed the number! It took you " + tryCounter + " try to find it.");
			}
			else{
				System.out.println("Congratulations! You guessed the number! It took you " + tryCounter + " tries to find it.");
			}
		}
	}

}
