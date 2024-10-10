package edu.wit.cs.comp1000;

import java.util.Scanner;

// Colby LaGrassa
public class PA2b {

	public static void main(String[] args) {
		 // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the values of a, b, and c
        System.out.print("Enter a b c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        // Check if the discriminant is negative (imaginary roots)
        if (discriminant < 0) {
            System.out.println("Roots: imaginary");
        }
        // Check if the discriminant is zero (one root)
        else if (discriminant == 0) {
            // Calculate the single root
            double root = -b / (2 * a);
            // Print the root formatted to 2 decimal places
            System.out.printf("Root: %.2f%n", root);
        }
        // Otherwise, the discriminant is positive (two real roots)
        else {
            // Calculate both roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Ensure the smaller root is printed first
            if (root1 > root2) {
                double temp = root1;
                root1 = root2;
                root2 = temp;
            }

            // Print both roots formatted to 2 decimal places
            System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
        }

        // Close the scanner
        scanner.close();
		
		
		
	}

}
