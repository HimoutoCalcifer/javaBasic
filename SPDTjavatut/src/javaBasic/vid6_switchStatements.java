package javaBasic;

import java.util.Scanner;

public class vid6_switchStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		SWITCH STATEMENTS check for equality, only for string, int, char, enums

//		switch(variable) {
//			case value1;
				//Do anything Here
//				break;
//			case value2;
				//Do anything Here
//				break; 
//		}
		
		System.out.print("Enter your Grade: ");
		char grade = sc.next().charAt(0);
		switch(grade) {
			case 'A':
				System.out.println("Outstanding");
				break;
			case 'B':
				System.out.println("Excellent");
				break;
			case 'C':
				System.out.println("Satisfactory");
				break;
			default:
				System.out.println("Invalid");
				
		}
		
		sc.close();
		
	}

}
