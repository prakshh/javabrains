package work;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello lambda expression");

        // 1. create separate class and implement this interface
        MyInter myinter = new MyInterImpl();
        myinter.sayHello();

        MyInter anon = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("I am inside an anonymous class");
            }
        };
        anon.sayHello();

        // 2. anonymous class for implementing interface
        MyInter anon2 = new MyInter(){
            @Override
            public void sayHello(){
                System.out.println("I am inside second anonymous class");
            }
        };
        anon2.sayHello();

        // 3. Lambda expression
        MyInter iLambda = () -> {
            System.out.println("I am a Lambda expression");
        };
        iLambda.sayHello();

        MyInter iLambda2 = () -> System.out.println("I am second Lambda expression");
        iLambda2.sayHello();


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