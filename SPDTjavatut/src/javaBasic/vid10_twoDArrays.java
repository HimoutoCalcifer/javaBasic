package javaBasic;

public class vid10_twoDArrays {

	public static void main(String[] args) {
//		2D ARRAYS
		
//		Declare with Values
//		datatype identifier[][]= {
//				{val1,val2},
//				{val1,val2},
//				{val1,val2},
//				{val1,val2},
//		}
		
		String userData[][] = {
				{"Howl", "howl123"},
				{"calcifer", "calcifer123"},
				{"mushu", "mushu123"},
				{"crikee", "crikee123"},
		};
		
		System.out.println(userData[3][1]);
		userData[3][1] = "crikee456";
		System.out.println(userData[3][1]);
		
		
//		Declare without Values
//		datatype identifier[][] = new datatype[rows][columns];
		String user[][] = new String[4][2];
		
//		Nested FOR LOOP, for loop within a for loop
//		for (int row = 0; row<user.length; row++) {
//			for(int col = 0; col<user[row].length; col++) {
//				System.out.println(user[row][col]);}
//		}
		
		for (int row = 0; row<userData.length; row++) {
			for(int col = 0; col<userData[row].length; col++) {
//				System.out.println(row + " " + col);
				System.out.println(userData[row][col]);
			}
		}
		
//		Iterating 2D ARRRAYS using for each loop
		for(String username[]: userData) {
			for(String info: username) {
				System.out.println(info);
			}
			
		}
		

		
		
	}

}
