package javaBasic;

import java.util.Scanner;

public class activity4_usercredentials {

	public static void main(String[] args) {
	//challenge in vid 4
		
	Scanner sc = new Scanner(System.in);
	
	String name[] ={"crikee", 
					"mushu", 
					"howl", 
					"calcifer"};
	
	String email[] = {"crikee@gmail.com", 
					  "mushu@gmail.com", 
					  "howl@gmail.com", 
					  "calcifer@gmail.com"};
	
	String password[] = {"crikee123", 
						 "mushu123", 
						 "howl123", 
						 "calcifer123"};
	
	int index;
	System.out.print("Enter the Index: ");
	index = sc.nextInt();
	System.out.println();
	System.out.println("Your Index: " + index);
	System.out.println("Your Name: " + name[index]);
	System.out.println("Your Email: " + email[index]);
	System.out.println("Your Password: " + password[index]);
	
	sc.close();
	}

}
