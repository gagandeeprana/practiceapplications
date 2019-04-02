package durga.multithreading;

public class JoinMethodSample {
    
    public static void main(String[] args) {
        
        JoinTwo two = new JoinTwo();
        JoinOne one = new JoinOne(two);
        one.start();
        two.start();
        try {
            if(one.isAlive()) {
                one.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++) {
            System.out.println("Main thread");
        }
    }
}
class JoinOne extends Thread {
 
    Thread t;
    
    public JoinOne(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {
        
        Thread.currentThread().setName("r1");
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++)
            System.out.println("Thread " + Thread.currentThread().getName());
    }
}
class JoinTwo extends Thread {

    @Override
    public void run() {
        
        Thread.currentThread().setName("r2");
        for(int i=0;i<10;i++) {
            System.out.println("Thread " + Thread.currentThread().getName());
        }
    }
}
