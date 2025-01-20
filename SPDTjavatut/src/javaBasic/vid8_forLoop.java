package javaBasic;

import java.util.Scanner;

public class vid8_forLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		CONDITIONS in FOR LOOP
		String[] characters = {"crikee", "howl", "mushu", "calcifer"};
		
		System.out.print("Enter a name: ");
		String name = sc.nextLine().trim();
		
		for (int j=0; j<characters.length; j++) {

			if (characters[j].equalsIgnoreCase(name)) {
				System.out.println(characters[j] + " is found in the list.");
				break;
			}else {
				System.out.println(characters[j]);
			}
		}	

//		Iterating ARRAYS
		String[] names = {};
		System.out.println("Enter names below separate , pls.");
		names = sc.nextLine().split(",");
		for (int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
//		FOR LOOP is run Repeatedly while the CONDITION is MET
		
//		for(initialization; condition; operation) {
			//do anything here
//		}
		
		System.out.print("Enter a number: ");
		int limit = sc.nextInt();
		for (int i=0; i<limit; i++) {
			System.out.println(i);
		}
		
		
		sc.close();
	}

}
