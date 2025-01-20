package javaBasic;

import java.util.Scanner;

public class vid9_for_eachLoop {

	public static void main(String[] args) {
//		FOR-EACH LOOP for collection of arrays
		
//		for (datatype identifier: collection) {
			//do anything here
//		}

		String[] names = {"calcifer", "crikee", "howl", "mushu"};
		for (String x: names) {
			System.out.println(x);
		}
		
		System.out.println();
//		CONDITION within FOR-EACH LOOP
		Scanner sc = new Scanner(System.in);
		String[] characters= {"calcifer", "crikee", "howl", "mushu", "sophie", "turnipHead", "noFace"};
		System.out.print("Enter a name to search: ");
		String search = sc.nextLine().trim();
		for (String name: characters) {
			if (name.equalsIgnoreCase(search)) {
				System.out.println(search + " is found in the List.");
				break;
			}else {
			System.out.println(name);
			}
		}
		
		
		
		sc.close();
	}

}
