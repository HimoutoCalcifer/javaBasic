package javaBasic;

public class vid11_methodsOrFunction {
//	Global Variable - within the class only
	static int num = 100;

	public static void main(String[] args) {
//		Local Variable

//		VARIABLE SCOPING
//		GLOBAL - declared within a class
//		LOCAL - declared inside method, condition, loops and other block code
//		that can only accessible within block code
		
		sayHello(); // calls the sayHello function/method
		say("crikee", 23);// calls the say function/method with asking arguments
		add(50, 60);// calls the add function/method with asking arguments
		int sum = addz(5,6);//calls the addz method with return 
		System.out.println(sum);
		
		System.out.println(isLegal(23));//calls isLegal method with asking arguments
		
		System.out.println(multiply(1, 2, 3));// calls multiply methods, you can have use same methods but different parameters 
		System.out.println(multiply(2, 5));
		
		
		
	}
// 	Methods or Functions
//	modifiers returntype methodName() {
	// do anything here
//	}

	static void sayHello() {
		System.out.println("Hello!");
	}

//	Arguments or Parameters
//		-a value that can be passed on a Method so the method can use that
//		value and perform various operations on it.
//		They acts as a Local variable inside a method/functio.

//		modifier returntype methodName(arguments) {
	// do anything here
//		}

	static void say(String name, int age) {
		print("Hello " + name);// calls the print method/function
		System.out.println("You are " + age + " years old");
	}

	static void print(String word) {
		System.out.println(word);// print method/function
	}

	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

//	RETURN Type - type is same as datatype
//	the type of value that will be return
//	void returns NOTHING
//	int returns INTEGERS
//	String returns STRING and so on...
	
//	modifier returntype methodName(arguments) {
		//do anything here
//		return value;
//	}
	
	static int addz(int number1, int number2) {
		return number1 + number2;
		}
	
	static boolean isLegal(int age) {
		if (age >= 18) {
			return true;
		}else {
			return false;
		}
	}
	
//	OVERLOADING Methods
//	you can use the method name BUT different arguments/parameters
	
	static int multiply(int x, int y) {
		return x * y;
	}
	
	static int multiply(int x, int y, int z) {
		return x * y * z;
	}
	
	
	
	
	
}
