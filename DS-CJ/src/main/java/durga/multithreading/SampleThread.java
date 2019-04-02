package durga.multithreading;

public class SampleThread {

    public static void main(String[] args) {
        
//        Runnable r = () -> {
//            System.out.println("implementing thread");
//        };
//        Thread t = new Thread(r);
//        t.start();
//        System.out.println("main thread");
//        t.stop();
        
//        T1 t1 = new T1();
//        t1.start();
//        for(int i=0;i<10;i++)
//        System.out.println("main thread");
//        t1.start();
        
//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.NORM_PRIORITY);
//        System.out.println(Thread.MAX_PRIORITY);

//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(7);
//        System.out.println(Thread.currentThread().getPriority());
        T1 t1 = new T1();
//        System.out.println(t1.getPriority());
        t1.setPriority(3);
        t1.start();
        System.out.println("Current thread priority: " + Thread.currentThread().getPriority());
        for(int i=0;i<10;i++)
            System.out.println("main thread");
        
        
//        T1 t1 = new T1();
//        System.out.println(t1.getPriority());
//        t1.setPriority(100);
//        System.out.println(t1.getPriority());
        /**
         * range allowed is 1-10, otherwise we will get Exception in thread "main" java.lang.IllegalArgumentException
         */
        
    }
}
class T1 extends Thread {
    
//    @Override
//    public void run() {
//        System.out.println("my overridden run method");
//    }
    
//    public void start() {
//        System.out.println("my start");
//    }
    
//    @Override
//    public synchronized void start() {
//        System.out.println("overridden inbuilt start method");
//    }
//    
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        System.out.println("my run");
    }
    
}
/**
 * Life cycle of a thread
 * 
 * T1 t = new T1() means new or born state
 * t.start means ready or runnable state (yield method can bring a thread from running state to runnable state).
 * If Thread Schedular allocates processor means running state
 * Once run method completes means dead state
 * 
 * 
 * Note: In case we try again to start the same thread, we will get Exception in thread "main" java.lang.IllegalThreadStateException
 * 
 * Thread priority varies from 1(min) to 10(max)
 * 
 * 
 *To prevent thread execution:
 *1. yield(): causes to pass current executing thread to give the chance for waiting threads of same priority, if there is not waiting
 *            thread or all waiting threads have low priority then same thread can continue its execution.
 *            
 *2. join(): 
 *3. sleep()
 */




