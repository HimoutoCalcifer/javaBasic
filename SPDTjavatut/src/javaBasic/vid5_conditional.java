package javaBasic;

import java.util.Scanner;

public class vid5_conditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Relational Operators
//		Equal ==
//		Not Equal !=
//		Less than <
//		Less than or Equal <=
//		Greater than or Equal >=
//		Greater than >
		
//		Logical Operators
//		AND &&
//		OR ||
//		NOT !
		
//		EQUALS FUCTION compare strings more efficiently
		String greet;
		System.out.print("Greet me...: ");
		greet = sc.nextLine();
		if (greet.equalsIgnoreCase("Hello")) {
			System.out.println("HI! How are you");
		}else if (greet.equals("hi")) {
			System.out.println("hi!!!");
		}else {
			System.out.println("notice the diff of .equals and other .equals");
		}
		
		System.out.println();
		boolean calculator;
		boolean pen;
		System.out.print("Do you bring calculator, true or false: ");
		calculator = sc.nextBoolean();
		System.out.print("Do you bring pen, true or false: ");
		pen = sc.nextBoolean();
		if (calculator == true && pen == true) {
			System.out.println("Take the test!");
		}else {
			System.out.println("Go Home!");
		}
		
//		IF STATEMENT means does something or nothing
//		if(condition) {
			//does something or nothing
//		}
		
		System.out.println();
		boolean introvert;
		System.out.print("Are you Introvert, true or false: ");
		introvert = sc.nextBoolean();
		if (introvert == true){
			System.out.println("Same, I am Introvert too!");
		}
		
		System.out.println();
		int age;
		System.out.print("How old are you? ");
		age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are in Legal Age");
		}
		
//		IF-ELSE STATEMENT means 2 conditions
//		if (condition) {
			//1st code block
//		}else {
			//2nd code block
//		}
		
		System.out.println();
		int grade;
		System.out.print("Enter your grade: ");
		grade = sc.nextInt();
		if (grade >= 85) {
			System.out.println("You PASSED the test");
		}else {
			System.out.println("You FAILED");			
		}
		
//		IF-ELSE IF-ELSE STATEMENT 3 or more conditions
//		if (condition) {
		//1st code block
//		}else if(condition){
		//2nd code block
//		}else {
		//3rd code block
//		}
		
		System.out.println();
		float gpa;
		System.out.print("Enter you GPA: ");
		gpa = sc.nextFloat();
		if (gpa >= 95) {
			System.out.println("You are in President List");
		}else if(gpa <= 94) {
			System.out.println("You are in Dean List");			
		}else {
			System.out.println("You are not qualified");						
		}
		
//		NESTED Conditional Statement 
//		if (condition) {
//			if (condition) { //Conditional statement within Conditional Statement		
//			}
//		}
		
		System.out.println();
		boolean isVerified = true;
		int myAge;
		System.out.print("Enter your Age: ");
		myAge = sc.nextInt();
		if (myAge >= 18) {
			System.out.println("You are in Legal Age");
			if (isVerified) {
				System.out.println("Qualified");
			}else {
				System.out.println("Not Qualified");
			}
		}else {
			System.out.println("You are not in Legal Age");
		}
	

		
		
		sc.close();
	}

}
