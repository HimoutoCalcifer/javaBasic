package javaBasic;

public class vid1and2_helloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.print("Hello ");
		System.out.println("World"); //print in line.
		System.out.print("crikee ");
	
		
		System.out.println("Declaring Variable");
		System.out.println("Datatype identifier; or ");
		System.out.println("Datatype identifier = value ");
		char middleName = 'V'; // one quote for char
		String name = "Denzel"; // double quote for string
		boolean isMaganda = true;
		int age = 000;
		float grade = 80.99f; //float always with f otherwise it's double
		double latestGrade = 81.00; // this is double
		char bloodtype = 'O';
		System.out.println(name + middleName + isMaganda + age + grade + latestGrade);
		
		System.out.println("Reassigning Variable");
		System.out.println("identifier = value; ");
		name = "crikee";
		isMaganda = false;
		grade = 80.80f; //float always with f otherwise it's double
		latestGrade = 81.99; // this is double
		System.out.println(name + middleName + isMaganda + age + grade + latestGrade);
	
		System.out.println("Concatenation"); //note: anything added to string will convert to string
		System.out.println("this a concatenation " + name);
		
		System.out.println("Challenge ");
		System.out.println("Hi my name is " + name);
		System.out.println("I am" + age + "years old");
		System.out.println("My GPA is " + grade);
		System.out.println("My bloodtype is" + bloodtype);

	}

}
