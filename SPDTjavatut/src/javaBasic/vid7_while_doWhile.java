package javaBasic;

import java.util.Scanner;

public class vid7_while_doWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		CONDITIONS in WHILE LOOP
		String[] characters = {"crikee", "howl", "mushu", "calcifer", "totoro"};
		int m = 0;
		System.out.print("Enter a character name in movie: ");
		String namez = sc.nextLine().trim();
		while (m < characters.length) {
			if (characters[m].equalsIgnoreCase(namez)) {
				System.out.println(characters[m] + " is found in the list");
				break;
			}
			m++;
		}
		
		
//		BREAK out of a LOOP STATEMENT earlier than expected to end
		System.out.println();
		int n = 0;
		while (n < 100) {
			System.out.println(n);
			n++;
			break; //break out the loop
		}
		System.out.println("DONE");
		
		
//		DO-WHILE LOOP executes the code-Block first before checking the condition
//		do {
			//do first before condition!!! NOTE: if you want to execute at least one time
//		} while (condition);
		
		System.out.println();
		int g = 5;
		do {
			System.out.println(g);
			g++;
		} while (g < 10);
		
	
//		ITERATING ARRAYS
		System.out.println();
		int f = 0;
		String[] names = {};
		System.out.println("Enter names in the movie below. separate with ,");
		names = sc.nextLine().split(",");
		System.out.println();
		System.out.println("Updated List: " + names.length + " elements");
		while (f < names.length) {
			System.out.println(names[f]);
			f++;
		}
		
//		WHILE a condition is met, repeatedly
//		while (condition) {
			//will repeatedly do anything
//		}
		
//		NOTE: use do while loop more efficient in this method
		System.out.println();
		System.out.print("Enter a number to start: ");
		int i = sc.nextInt(); //what number to start
		System.out.print("Enter a numberto stop: ");
		int h = sc.nextInt(); //what number to stop
		while (i <= h) { 
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		int j = 0;
		System.out.print("Enter a numberto stop: ");
		int k = sc.nextInt(); //what number to stop
		while (j < k) { 
			System.out.println("Hello World!");
			j++;
		}
	
		
		
		
		
		sc.close();
		
		
	}

}
