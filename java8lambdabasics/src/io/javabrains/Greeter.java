package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting) {
		//System.out.println("Hello world!");
		greeting.perform();
	}

	public static void main(String[] args) {
			Greeter greeter = new Greeter();
				//HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
				Greeting helloWorldGreeting = new HelloWorldGreeting(); 

				greeter.greet(helloWorldGreeting); 
				System.out.println("//this will Need above greet() method");
			
				helloWorldGreeting.perform(); 
				System.out.println("// this will NOT need above greet() method, as Parent interface Greeting type reference variable has child implementation class HelloWorldGreeting type object");
			
			Greeting lambdaGreeting = () -> System.out.println("\n 1. Hello world using Lambda!");  // this reduces code as this does NOT Need any of above codes
			lambdaGreeting.perform(); // this line seems (but, not actually true) like lambda expression is implementing interface class.
                              		      // this line seems (but, not entirely true) like a shortcut to create an anonymous inner class that can do the same thing (calling interface method, by assigning function to interface type variable)
			                              // as there is more in anonymous inner class
			//anonymous inner class
			Greeting innerClassGreeting = new Greeting() {
				public void perform() {
					System.out.println("Hello world from anonymous inner class");
				}
			};
			innerClassGreeting.perform(); // this line is not compulsory as below
			
			greeter.greet(lambdaGreeting);  // prints - \nHello world using Lambda!
			
			greeter.greet(() -> System.out.println("\n 2. Hello world using Lambda!")); // in place of lambdaGreeting, just the entire value/block can be put
			greeter.greet(innerClassGreeting);  // prints - Hello world from anonymous inner class
			
		}

}

/*
 
rule of creating lambda expression

1. create an interface (type of lambda expression should be an interface)
2. signature of lambda expresion should match with interface method signature
(both no-argument, or both int a, int b)

note:
1. each lambda expression should have only one interface with one method
2. no ned to create interface if already there is an interface whose signature matches 

with lambda's


 * */
