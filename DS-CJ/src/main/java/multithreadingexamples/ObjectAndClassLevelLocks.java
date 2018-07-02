package multithreadingexamples;

public class ObjectAndClassLevelLocks {

	public static void main(String[] args) {

		MyThread my1 = new MyThread();
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my1);
		t1.setName("t1");
		t1.start();
		t2.setName("t2");
		t2.start();
	}
}

class MyThread implements Runnable {

	public void run() {
		lock();
	}

	public void lock() {

		System.out.println("Name: " + Thread.currentThread().getName());
		synchronized (MyThread.class) {

			System.out.println("class level sync started: " + Thread.currentThread().getName());
			System.out.println("class level sync ended: " + Thread.currentThread().getName());
		}
		synchronized (this) {

			System.out.println("object level sync started: " + Thread.currentThread().getName());
			System.out.println("object level sync ended: " + Thread.currentThread().getName());
		}
		System.out.println("after sync: " + Thread.currentThread().getName());

	}
}
