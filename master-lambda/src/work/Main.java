package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello lambda expression");

        MyInter myinter = new MyInterImpl();
        myinter.sayHello();
    }
}

/*
Functional interface
- interface that has only one abstract method
- e.g., Runnable (with run() method),
        Callable (with call() method),
        Comparable (with compareTo() method)
- to call lambda, we require functional interface
 */