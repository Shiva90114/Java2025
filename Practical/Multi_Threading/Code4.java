// Code -4
// Multi Threading
// multiple thread
//
class MyThread extends Thread {

	MyThread(String name) {
	
		super(name);
	}

	public void run() {
	
			System.out.println("In run :"+getName()); 
	}
}
class Client {

	public static void main(String[] args) {
	
		MyThread t1 = new MyThread("Thread_New");
	
		t1.start();
		
		 System.out.println(Thread.currentThread());
	}
}
