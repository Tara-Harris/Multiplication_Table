package taraharris.CoreJava.BasicJavaDataTypes;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		/*
		 * 3. Write a Java program that takes a number and prints the results of it
		 * multiplied from 1 to 10
		 * 
		 * Example: Input a number: 8 Expected Output: 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24
		 * ... 8 x 10 = 80
		 */

		Scanner input = new Scanner(System.in);
		// ask user to input a number
		System.out.println("Enter a number: ");
		int num1 = input.nextInt();
		// print multiplication table up to 10
		for (int i = 0; i < 10; i++)
			System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));

		input.close();

	}

}
