package io.javabrains;

public class TypeInferenceExample {

	/*
    public static void main(String[] args) {
		//StringLengthLambda myLambda = (String s) -> s.length();
		//StringLengthLambda myLambda = (s) -> s.length(); // as String is already declared in interface method parameter
		StringLengthLambda myLambda = s -> s.length(); // possible, when only one argument
		System.out.println(myLambda.getLength("Hello Lambda"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}
	*/
	
	// Type Inference - how compiler inferring(concluding) your code, understanding return type, interface type, and where you are sending lambda expression
	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda from Type Inference"));
	}
	interface StringLengthLambda{
		int getLength(String s);
	}
	

}
