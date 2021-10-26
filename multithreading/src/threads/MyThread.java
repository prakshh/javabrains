package threads;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("value of i is : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        Thread thread = new Thread(mythread);
        thread.start();
    }
}
