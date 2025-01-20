package javaBasic;
  
import java.util.Scanner;

public class activity11_summationOfNumbers {

	public static void main(String[] args) {
	//Challenge in vid 11
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter numbers separated by \" , \" : ");
//	int[] numbers = scanner.nextInt();
		
	
	int[] numbers = {1, 2, 3, 4, 5};
	int result = summation(numbers);
	System.out.println(result);
	
	
	}

	static int summation(int numbers[]) {
		int sum = 0;
		
		for(int number: numbers) {
			sum = sum + number;
		}
		
		return sum;
		
	}
}
