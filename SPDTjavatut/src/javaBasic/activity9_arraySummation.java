package javaBasic;


public class activity9_arraySummation {

	public static void main(String[] args) {
		//Challenge in vid 9
		
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		int sum = 0;  //this is initialized method
		for(int number: numbers){
			sum = sum + number;
		}
		System.out.println("Sum is: " + sum);
		
	}

}
