package projectSynchronize;

public class Company {
    boolean f = false;
    // if f=false, then chance : producer
    // if f=true, then chance : consumer

    int n;
    synchronized public void produce_item(int n) throws InterruptedException {
        if(f) wait();
        this.n = n;
        System.out.println("Produced : " + this.n);
        f = true;
        notify();
    }
    synchronized public int consume_item() throws InterruptedException {
        if(!f) wait();
        System.out.println("Consumed : " + this.n);
        f = true;
        notify();
        return this.n;
    }
}
