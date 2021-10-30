package work;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runthread1 = () -> {
//            this is body of thread
            for(int i=1; i<=10; i++){
                System.out.println("Value of i is : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(runthread1);
        t1.setName("John");
        t1.start();

        Runnable runthread2 = () -> {
            for(int i=1; i<=10; i++) {
                System.out.println(2 + " * " + i + " = " + 2 * i);
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(runthread2);
        t2.setName("Wick");
        t2.start();


    }
}
