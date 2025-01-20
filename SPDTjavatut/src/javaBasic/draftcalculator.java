package javaBasic;

import java.util.Scanner;

public class draftcalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		String operation;
		double result;
				
		System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        operation = sc.next();


        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero");
                return;
            }
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.printf("%.2f %s %.2f = %.2f%n", num1, operation, num2, result);

        sc.close();
				
				
	}

}
