/*
 * Jesus Hernandez 614019
 * 10-06-16
 * Assignment 6 Question 2
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> scoreArrayList = new ArrayList<Integer>();
		
		int score;
		int counter;
		
		System.out.print("Number of grades to be entered: ");
		counter = input.nextInt();
		
		while(counter > 0){
			System.out.print("Enter score: ");
			score = input.nextInt();
			scoreArrayList.add(score);
			counter--;
		}
		
		Score scoreObject = new Score(scoreArrayList);
		
		scoreObject.checkValues();
		
		System.out.println("Scores: ");
		scoreObject.printScores();
		
		System.out.println("Avg: " + scoreObject.getAverage());
		
		input.close();
	}
}
