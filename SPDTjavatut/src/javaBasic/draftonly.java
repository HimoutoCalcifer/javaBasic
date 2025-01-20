package javaBasic;

import java.util.Scanner;

public class draftonly {
	
	static int legalAge = 18;
	static String name;
	static int grade = 90;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		sayHello();
		
		legalAge = 24;
		System.out.println(legalAge);
		
		System.out.println("Enter your name: ");
		name = scanner.nextLine();
		greet(name);
		
		data(80, 90, name);
		
		grade = 90;
		grade = summation(85, 63);
		System.out.println(grade);
		
		String [][] userData = {
				{"crikee", "crikee123"},
				{"mushu", "mushu123", "mushured"},
				{"howl", "howl123", "sofie", "sofie123"},
		};
		
		for (int row = 0;row < userData.length; row++) {
			for (int col = 0 ; col <userData[row].length; col++) {
				System.out.println(row + " , " +col);
				System.out.println(userData[row][col]);
			}
			System.out.println();
		}
		
		
		
		

	}

	static void sayHello() {
		System.out.println("Hello");
	}
	
	static void greet(String name) {
		System.out.println("Hello! " + name);
	}
	
	static void data(int n1, int n2, String word) {
		System.out.println("Hello " + word);
		int sum = n1 + n2;
		System.out.println("your grade is " + sum);
	}
	
	static int summation(int num1, int num2) {
		
		return num1 + num2;
	}
	
}
