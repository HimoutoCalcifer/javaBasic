package javaBasic;

import java.util.Scanner;

public class activity7_quizgames_userQandA {

	public static void main(String[] args) {
		//Challenge in vid7
		
		Scanner sc = new Scanner(System.in);
		
		String question = "";
		String answer = "";
		String userAns;
		int attemp = 0;
		int limit = 3;
		System.out.println("Enter a question you want to ask: (String only pls)");
		question = sc.nextLine().trim();
		System.out.println("Enter the answer from question above: ");
		answer = sc.nextLine().trim();//good practice is to use .trim to remove whitespace
		
		System.out.println();
		if (question != "" && answer != "") {
			System.out.println("Ask your friend to answer that question.");
			
			do {
				System.out.println(question + " ?");
				userAns = sc.nextLine().trim();  
				
				if (answer.equalsIgnoreCase(userAns)) {
					System.out.println("CORRECT!");
					break;
				}else{
					System.out.println("WRONG!");
					System.out.println();
					limit--;
				}
			}while(attemp < limit);
		}else {
			System.out.println("No question data available");
		}
		if (attemp < limit) {
			System.out.println("You WON!!!");
		}else {
			System.out.println("You LOST");
		}
		sc.close();
		
	}

}
