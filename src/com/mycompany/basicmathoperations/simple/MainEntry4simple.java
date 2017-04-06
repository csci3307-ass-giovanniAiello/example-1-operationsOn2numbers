/**
 * 
 */
package com.mycompany.basicmathoperations.simple;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ilker
 *
 */
public class MainEntry4simple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4simple with args:" + args);
		System.out.println("still main of MainEntry4simple with args:" + Arrays.toString(args));
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		float result;
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2");
		number2 = scanner.nextInt();
		
		
		// Multiply block
		Multiply multiplier = new Multiply();
		result = multiplier.multiply(number1, number2);
		System.out.printf("Multiply result is %.2f%n", result);
		scanner.close();
		// Divide block
		Divide divider = new Divide();
		result = divider.divide(number1, number2);
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("Divide result is %.2f%n", result);
		scanner.close();
		//Add block
		Add adder = new Add();
		result = adder.add(number1, number2);
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("Add result is %.2f%n", result);
		scanner.close();
		//Subtract block
		Subtract subtracter = new Subtract();
		result = subtracter.subtract(number1, number2);
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("Subtract result is %.2f%n", result);
		scanner.close();
	}

}
