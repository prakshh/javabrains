package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			//@Override
			public void run() {
				System.out.println("Printed inside Runnable. // Just doing Anonymous inner class, rather than creating new class and then create an instance");			
			}
		});

		myThread.run();
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable. // This Lambda shortcut works here because Runnable has a single method"));
		myLambdaThread.run();
	}

}
