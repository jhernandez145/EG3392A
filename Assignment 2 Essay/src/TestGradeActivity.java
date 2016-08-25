/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 1
 */
import java.util.Scanner;

public class TestGradeActivity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
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

		totalPoints = grammarPoints + spellingPoints +contentPoints;
		
		Essay myEssay = new Essay(grammarPoints, spellingPoints, contentPoints, totalPoints);
		
		/* 
		 * System.out.println("G " + myEssay.getGrammarGrade() + " S " + myEssay.getSpellingGrade() + " C " + myEssay.getContentGrade());
		 *  System.out.println("SCORE " + totalPoints + " eSCORE " + myEssay.getScore() + " G " + myEssay.getGrade());
		 *  System.out.println("MAX: " + ESSAY_MAX_POINTS);
		 */
		System.out.println(myEssay.toString());
	}
}
