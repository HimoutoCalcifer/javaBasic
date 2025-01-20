package javaBasic;

public class activity10_2dArray {

	public static void main(String[] args) {
		//from vid 10
		
		String[][] userData = {
				{"crikee", "crikee123"},
				{"mushu", "mushu123"},
				{"howl", "howl123"},
				{"calcifer", "calcifer123"},
		};
		
		for(String username[]: userData) {
			for(String password:username) {
				System.out.println(password);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int row = 0; row<userData.length; row++) {
			for(int col = 0; col<userData[row].length;col++) {
				System.out.println(row + " " + col);
			}
		}

	}
}
