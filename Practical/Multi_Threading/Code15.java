// Code -15
// Multi Threading
// Thread Synchronization
// DeadLock //
class MyThread extends Thread {

	static Thread mainThread =null;// not deadLock //Exception in thread "Thread-0" java.lang.NullPointerException
	//static Thread mainThread =Thread.currentThread(); // deadLock
	public void run() {
		try{
			for(int i =0;i<10;i++) {
				System.out.println(Thread.currentThread().getName());
				mainThread.join();
				Thread.sleep(2000);
			}
		} catch(InterruptedException ie) {
		
		}
	}

}
class Client {

	public static void main(String[] args) throws InterruptedException {
 
	// deadLock (use both line)
	// MyThread.mainThread = Thread.currentThread(); // option 	
		MyThread mt = new MyThread();
		mt.start();
	        mt.join();
	        for(int i =0;i<10;i++) {	
        	System.out.println(Thread.currentThread().getName());
		}
	}
}
