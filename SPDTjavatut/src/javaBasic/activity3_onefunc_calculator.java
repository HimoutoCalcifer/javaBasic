package javaBasic;

import java.util.Scanner;

public class activity3_onefunc_calculator {

	public static void main(String[] args) {
		//challenge in vid 3
		
		Scanner sc = new Scanner(System.in);
		
		float x;
		float y;
		float z;
		
		System.out.print("Enter first number: ");
		x = sc.nextFloat();
		System.out.print("Enter second number: ");
		y = sc.nextFloat();
		z = x/y;
		System.out.println();
		System.out.println(x + "/" + y + "=" + z);
		sc.close();
		
	}

}
