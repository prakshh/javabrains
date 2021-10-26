package threads;

public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("program started");
        System.out.println("sum of 5 and 6 is : " + (5 + 6) );

//        System.out.println("current thread is : " + Thread.currentThread().getName());
        Thread t = Thread.currentThread();
        String s = t.getName();
        System.out.println("current thread is = " + s);

        t.setName("Mymain");
        System.out.println("thread name set to : " + t.getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread ID is : " + t.getId());

        System.out.println("program ended");
    }
}
