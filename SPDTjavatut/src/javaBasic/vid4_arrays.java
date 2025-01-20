package javaBasic;

import java.util.Scanner;

public class vid4_arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		Datatype identifier[] = new Datatype[size];
		int numbers[] = new int[5];
		System.out.print("Enter number: ");
		numbers[0] = sc.nextInt();
		System.out.println(numbers[0]);
		System.out.println();
		
//		Datatype identifier[] = {val1, val2, val3}
		String characters[] = {"crikee", "mushu", "howl", "calcifer"}; 
		int evenNumbers[] = {2, 4, 6, 8, 10};
		
//		Identifier[index];
		System.out.println(characters[3]);
		System.out.println(evenNumbers[1] + evenNumbers[2]);
		
//		Identifier[index] = value;
		characters[2] = "totoro";
		System.out.println(characters[2]);
		
		sc.close();

	}

}
