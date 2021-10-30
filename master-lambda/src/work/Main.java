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

        // sum of two numbers using lambda
//        SumInter suminter = (int a, int b) -> { return a + b; };
        SumInter suminter = (a, b) -> a + b; // optimizing the code as single line
        // SumInter's method helps to understand the type of the arguments
        System.out.println(suminter.sum(5, 2));
        System.out.println(suminter.sum(6, 4));

        // length of a string
        LengthInter len = (str) -> str.length();
        System.out.println(len.getLength("Matrix Resurrections"));


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