package javaBasic;

import java.util.Scanner;

public class activity5_grade_average {

	public static void main(String[] args) {
	//Challenge in vid 5
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input your Grades below:");
	System.out.print("Math: ");
	double math = sc.nextDouble();
	System.out.print("English: ");
	double english = sc.nextDouble();
	System.out.print("Science: ");
	double science = sc.nextDouble();
	System.out.print("Filipino: ");
	double filipino = sc.nextDouble();
	
	System.out.println();
	double avg = (math + english + science + filipino)/4;
	System.out.println("Your AVG Grade is : " + avg);
	if (avg > 100) {
		System.out.println("Invalid Grade");
	}else if(avg >= 98) {
		System.out.println("With Highest Honors");		
	}else if(avg >= 95) {
		System.out.println("With High Honors");		
	}else if(avg >= 90) {
		System.out.println("With Honors");		
	}else if(avg >= 75) {
		System.out.println("PASSED");		
	}else {
		System.out.println("FAILED");
	}
	
	sc.close();
	
	}

}
