package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello lambda expression");

        MyInter myinter = new MyInterImpl();
        myinter.sayHello();

        MyInter anon = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("I am inside an anonymous class");
            }
        };
        anon.sayHello();

        MyInter anon2 = new MyInter(){
            @Override
            public void sayHello(){
                System.out.println("I am inside second anonymous class");
            }
        };
        anon2.sayHello();
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