// Code -7
// Multi Threading
// multiple thread


class MyThread implements Runnable {

	public void run() {

	
			System.out.println("In run"); 
	                System.out.println(Thread.currentThread().getName());
		
	}
}
class Client {

	public static void main(String[] args) {	
		MyThread mt = new MyThread(); // Runnable object
		Thread t1 = new Thread(mt);   // Thread object with Runnable
		t1.start();                   // starts new thread → calls mt.run()

			System.out.println(Thread.currentThread().getName());
			
		
		
	}
}
