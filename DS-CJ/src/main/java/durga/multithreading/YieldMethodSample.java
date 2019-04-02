package durga.multithreading;

public class YieldMethodSample {
    
    public static void main(String[] args) {
        
        YieldThread thread = new YieldThread();
        thread.start();
        for(int i=0;i<20;i++) {
            Thread.yield();
            System.out.println("Main thread");
        }
    }
}
class YieldThread extends Thread{
    
    @Override
    public void run() {
        for(int i=0;i<20;i++) {
            System.out.println("Yield One");
        }
    }
}
