package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("printing All persons sorted by last name");
		printAll(people);
		
		// Step 3: Create a method that prints all people that have last name beginning with C 
			//printLastNameBeginningWithC(people);  //can be done using a Condition interface and printConditionally()
		System.out.println("\nPrinting all persons with last name beginning with C");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		System.out.println("\nPrinting all persons with first name beginning with C");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	
	
	}
	

	/*
	private static void printLastNameBeginningWithC(List<Person> people) {
		System.out.println("printLastNameBeginningWithC");
		for(Person p : people) {
			if(p.getLastName().startsWith("C"))
				System.out.println(p);
		}
	}
	*/
	//can be done using a Condition interface and printConditionally()
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p))
				System.out.println(p);
		}
	}
	
	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);  //this calls the toString() method of Person class
		}
	}
}

interface Condition{
	boolean test(Person p);
}

