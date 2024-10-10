package edu.wit.cs.comp1000;

import java.util.Scanner;


// Colby LaGrassa
public class PA2a {

	public static void main(String[] args) {
		// Create a scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Declare variables to store the sums and counts
        int totalSum = 0;
        int positiveSum = 0;
        int nonPositiveSum = 0;
        int positiveCount = 0;
        int nonPositiveCount = 0;

        // Ask the user to enter 5 numbers
        System.out.print("Enter five whole numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        // Add up all the numbers for the total sum
        totalSum = num1 + num2 + num3 + num4 + num5;

        // Check each number to see if it is positive or non-positive
        if (num1 > 0) {
            positiveSum += num1;
            positiveCount++;
        } else {
            nonPositiveSum += num1;
            nonPositiveCount++;
        }

        if (num2 > 0) {
            positiveSum += num2;
            positiveCount++;
        } else {
            nonPositiveSum += num2;
            nonPositiveCount++;
        }

        if (num3 > 0) {
            positiveSum += num3;
            positiveCount++;
        } else {
            nonPositiveSum += num3;
            nonPositiveCount++;
        }

        if (num4 > 0) {
            positiveSum += num4;
            positiveCount++;
        } else {
            nonPositiveSum += num4;
            nonPositiveCount++;
        }

        if (num5 > 0) {
            positiveSum += num5;
            positiveCount++;
        } else {
            nonPositiveSum += num5;
            nonPositiveCount++;
        }

        // Calculate the averages (only if there are positive or non-positive numbers)
        double positiveAverage = 0;
        if (positiveCount > 0) {
            positiveAverage = (double) positiveSum / positiveCount;
        }

        double nonPositiveAverage = 0;
        if (nonPositiveCount > 0) {
            nonPositiveAverage = (double) nonPositiveSum / nonPositiveCount;
        }

        double totalAverage = (double) totalSum / 5;

        // Print out the results
        System.out.println("The sum of the " + positiveCount + " positive numbers: " + positiveSum);
        System.out.println("The sum of the " + nonPositiveCount + " non-positive numbers: " + nonPositiveSum);
        System.out.println("The sum of the 5 numbers: " + totalSum);
        System.out.printf("The average of the %d positive numbers: %.2f%n", positiveCount, positiveAverage);
        System.out.printf("The average of the %d non-positive numbers: %.2f%n", nonPositiveCount, nonPositiveAverage);
        System.out.printf("The average of the 5 numbers: %.2f%n", totalAverage);

        // Close the scanner
        input.close();
		
	}

}
