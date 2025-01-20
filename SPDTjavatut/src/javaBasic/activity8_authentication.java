package javaBasic;

import java.util.Scanner;

public class activity8_authentication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] userNames = {"mushu", "crikee", "howl", "calcifer"}; 
		String[] userPasswords = {"mushu123", "crikee123", "howl123", "calcifer123"}; 
		
		System.out.print("Enter your username: ");
		String username = sc.nextLine().trim();
		System.out.print("Enter your password: ");
		String pass = sc.nextLine().trim();
		
		boolean isExist = false;
		
		for (int i = 0; i < userNames.length && i < userPasswords.length; i++) {
			if(userNames[i].equalsIgnoreCase(username) && userPasswords[i].equalsIgnoreCase(pass)) {
				isExist = true;
				break;
			}
		}
		if (isExist) System.out.println("WELCOME " + username);
		else System.out.println("Invalid Input!");
		
		sc.close();
	}

}
