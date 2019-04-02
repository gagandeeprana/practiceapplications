package durga.multithreading;

public class SynchronizationSample {

    public static void main(String[] args) {
        
        Display d = new Display();
        ThreadOne t1 = new ThreadOne(d, "Dhoni");
        ThreadTwo t2 = new ThreadTwo(d, "Kohli");
        t1.start();
        t2.start();
    }
}
class Display {
    
    public synchronized void show(String name) {
        
        for(int i=0;i<5;i++) {
            System.out.println(name + " is batting");
        }
    }

    public void disp(String name) {
        
        for(int i=0;i<5;i++) {
            System.out.println(name + " is bowling");
        }
    }
}
class ThreadOne extends Thread {
    
    Display d;
    String name;
    
    public ThreadOne(Display d, String name) {
        this.d = d;
        this.name = name;
    }
    
    @Override
    public void run() {
        d.show(name);
        d.disp(name);
    }
}
class ThreadTwo extends Thread {
    
    Display d;
    String name;
    
    public ThreadTwo(Display d, String name) {
        this.d = d;
        this.name = name;
    }
    
    @Override
    public void run() {
        d.show(name);
        d.disp(name);
    }
}
