/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 1
 */
import java.util.Scanner;

public class TestGradeActivity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ESSAY_MAX_POINTS = 100;
		int grammarPoints;
		int spellingPoints;
		int contentPoints;
		double totalPoints;

		System.out.print("Enter grammar points: ");
		grammarPoints = input.nextInt();
		System.out.print("Enter spelling points: ");
		spellingPoints = input.nextInt();
		System.out.print("Enter content points: ");
		contentPoints = input.nextInt();
		System.out.println();

		input.close();

		totalPoints = (100.00 * ((double) (grammarPoints + spellingPoints + contentPoints) / ESSAY_MAX_POINTS));

		Essay myEssay = new Essay(grammarPoints, spellingPoints, contentPoints, totalPoints);

		System.out.println(myEssay.toString());
	}
}
