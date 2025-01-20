package javaBasic;

import java.util.Scanner;

public class activity6_dateFormatteroutdated {

	public static void main(String[] args) {
	//Challenge in vid 6	
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Dates below in this format: 7/7/7 ");
	System.out.print("Month: ");
	int mon = sc.nextInt();
	System.out.print("Day: ");
	int day = sc.nextInt();
	System.out.print("Year: ");
	int year = sc.nextInt();
	
	String month = "";
		
	switch (mon) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			System.out.println("Month is Invalid");
			return;
			
	}
	
	System.out.println();
	
	if (month == "") {
		System.out.println("Month is Invalid");
	}else {
		if (day > 31 || day <= 0) System.out.println("Invalid Date");
		else System.out.println(month + " " + day + ", " + year);
	}
		
	sc.close();
	
	}

}
