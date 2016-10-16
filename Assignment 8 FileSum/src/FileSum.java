/*
 * Jesus Hernandez 614019
 * 10-19-16
 * Assignment 8 Question 1
 */

import java.io.*;
import java.util.Scanner;

public class FileSum {
	public static void main(String[] args) throws IOException {
		final int SENTINEL_VALUE = -1;
		int number = 0;

		Scanner input = new Scanner(System.in);
		File file = new File("TextFiles\\Numbers.txt"); // Use the included Numbers.txt files from the TextFiles
														// To make sure it exists and know where it is
		PrintWriter output = new PrintWriter(file); // PrintWritter resets data in file every time it executes

		while (number != SENTINEL_VALUE) {
			System.out.print("Enter any Integer (-1 to quit): ");
			number = input.nextInt();
			if (number != SENTINEL_VALUE) {
				output.print(number + " ");	// Outputs value plus one space into file
			} else {
				continue;	// Once sentinel value is entered, break out of while without outputting sentinel value to file
			}
		}
		System.out.println();
		input.close();
		output.close();
		printDataFromFile(file);
		System.out.println("Sum from file " + file.getName() + ": " + getSum(file));

	}
	// Prints number in the file with a space in between
	public static void printDataFromFile(File file) throws IOException {
		System.out.println("Data from file " + file.getName() + ":");
		try {
			Scanner inputFile = new Scanner(file);
			while (inputFile.hasNext()) {
				String string = inputFile.nextLine();
				System.out.println(string);
			}
			inputFile.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	// Sums the numbers in the file.
	public static int getSum(File file) {
		int sum = 0;
		try {
			Scanner inputFile = new Scanner(file);
			while (inputFile.hasNext()) {
				int data = inputFile.nextInt();
				sum += data;
			}
			inputFile.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return sum;
	}
}