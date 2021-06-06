package com.telusko.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Autowired
	Laptop lap;
	
	public void code() {
		System.out.println("I am coding..");
		lap.compile();
	}

}

/*
@Component
You can mention @Component to class, 
to let Spring framework know that it has responsibility to create the object
of this class Alien.

@Autowired
- used when we need an object of a class inside a class. (else, null pointer exception)
- it tells Spring to create the object, also not to forget
- @Component should be above every class name. (else, no beans exception)

this is Dependency Injection (Inversion of control)
where Spring manages to inject dependencies
*/
