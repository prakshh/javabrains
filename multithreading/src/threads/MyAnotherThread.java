package threads;

public class MyAnotherThread extends Thread {
    public void run(){
        for(int i=10; i>=1; i--){
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){

            }
            System.out.println("Another thread : " + i);
        }
    }

    public static void main(String[] args) {
        MyAnotherThread anotherthread = new MyAnotherThread();
        anotherthread.start();
    }
}
