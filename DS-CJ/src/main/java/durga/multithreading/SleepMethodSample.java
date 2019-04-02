package durga.multithreading;

public class SleepMethodSample {
    
    public static void main(String[] args) throws InterruptedException {
        
        SleepOne thread = new SleepOne();
        thread.start();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class SleepOne extends Thread {
    
    @Override
    public void run() {
        
        Thread.currentThread().setName("sleepone");
        for(int i=0;i<10;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
