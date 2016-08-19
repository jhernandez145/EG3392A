/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 1 Question 1
 */import java.util.Scanner;
public class TestPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int X_1;
		int Y_1;
		
		int X_2;
		int Y_2;
		
		System.out.print("X_1: ");
		X_1 = input.nextInt();
		System.out.print("Y_1: ");
		Y_1 = input.nextInt();
		ThePoint point1 = new ThePoint(X_1, Y_1);
		
		System.out.print("X_2: ");
		X_2 = input.nextInt();
		System.out.print("Y_2: ");
		Y_2 = input.nextInt();
		ThePoint point2 = new ThePoint(X_2, Y_2);
		
		input.close();
		
		System.out.println("\n\nDistance between points: " + point1.distance(point2));
	}

}
