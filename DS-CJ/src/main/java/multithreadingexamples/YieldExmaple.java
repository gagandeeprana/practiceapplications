package multithreadingexamples;

public class YieldExmaple {

    public static void main(String[] args) {
        
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
class Thread1 implements Runnable {
    
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Thread1");
            if(i  == 3) {
                Thread.yield();
            }
        }
    }
}

class Thread2 implements Runnable {
    
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Thread2");
        }
    }
}