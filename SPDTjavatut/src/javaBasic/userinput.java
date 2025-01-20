package javaBasic;

import java.util.Scanner;
// type import java.util with * for all packages, or . for specific class
//always import after the package and before the public class
//always use scanner if need to prompt the user

public class userinput {

	public static void main(String[] args) {
		System.out.println("User Input");

//		 String x;
//		 Scanner scanner_name = new Scanner(System.in)
//		 x = scanner_name.nextLine();

		Scanner ln = new Scanner(System.in);
		String name;
		System.out.print("Enter your name: ");
		name = ln.nextLine();
		System.out.print("Your name is " + name);
		ln.close();

//		use nextInt(); or nextFloat();
		
//		Scanner num = new Scanner(System.in);
//		int x;
//		System.out.println("Enter your age: ");
//		x = num.nextInt();
//		System.out.print(x);
//		num.close();

	}

}
