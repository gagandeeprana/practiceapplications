package durga.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * We will get Exception in thread "main" java.lang.IllegalMonitorStateException, if don't use wait, notify and notifyAll methods
 * inside synchronized block or method.
 * 
 * wait, notify and notifyAll methods lie in Object class because these methods wait for lock and locks are per Object basis.
 * Even, thread can call these methods on any object.
 * 
 */
public class InterThreadCommunication {

    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<Integer>();
        InterTwo secondThread = new InterTwo(l);
        secondThread.start();
        InterOne thread = new InterOne(l);
        thread.start();
    }
}
class InterOne extends Thread {
    
    List<Integer> l;
    
    public InterOne(List<Integer> l) {
        this.l=l;
    }
    
    @Override
    public void run() {
        System.out.println("opening");
            
        synchronized (l) {
            
            for(int i=0;i<10;i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Adding elem " + i);
                l.add(i);
            }

            System.out.println("notifying...");
            l.notify();
            try {
                System.out.println("waiting after adding");
                l.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("waiting over for adding....");
        }
        System.out.println("closing");
    }
}
class InterTwo extends Thread {
    
    List<Integer> l;
    
    public InterTwo(List<Integer> l) {
        this.l=l;
    }
    
    @Override
    public void run() {
        synchronized (l) {
            while(l.isEmpty()) {
                try {
                    System.out.println("list is empty");
                    l.wait();
                    System.out.println("waiting over...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("list size " + l.size());
            System.out.println("start removing...");
            ListIterator<Integer> li = l.listIterator();
            while(li.hasNext()) {
                Integer i = li.next();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("removing elem " + i);
                li.remove();
            }
            System.out.println("removed all.");
            System.out.println("notifying adding...");
            l.notify();
            System.out.println("notified adding...");
        }
    }
    
}














