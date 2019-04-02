package durga.multithreading;

public class SynchronizationCounterExample {

    public static void main(String[] args) {
    
        Counter counter = new Counter();
        CounterThread threadOne;
        GetCounterThread getCounterThread = null;
        for(int i=0;i<10;i++) {
            threadOne = new CounterThread(counter);
            threadOne.start();
            getCounterThread = new GetCounterThread(counter, threadOne);
        }
        getCounterThread.start();
    }
}
class CounterThread extends Thread {
    
    Counter counter;
    
    public CounterThread(Counter counter) {
        this.counter = counter;
    }
    
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName() + " incremented the counter value to " + counter.increment());
        counter.increment();
    }
}

class GetCounterThread extends Thread {
    
    Counter counter;
    CounterThread counterThread;
    
    public GetCounterThread(Counter counter, CounterThread counterThread) {
        this.counter = counter;
        this.counterThread = counterThread;
    }
    
    @Override
    public void run() {
        try {
            counterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Incremented counter value is " + counter.getValue());
    }
}
class Counter {
    
    int count = 0;
    
    public synchronized void increment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }
    
    public synchronized int getValue() {
        return count;
    }
}
