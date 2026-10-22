// Code -2
// Multi Threading
// multiple thread

class MyThread extends Thread {

	public void run() {
	
		for(int i =0;i<10;i++) {
		
			System.out.println(getName()); // Thread-0
		}
	}
}
class Client {

	public static void main(String[] args) {
	
		MyThread t1 = new MyThread();
		t1.start();
		for(int i =0;i<=10;i++) {
		
			System.out.println(Thread.currentThread().getName()); // name - Main
		}
		 System.out.println(Thread.currentThread());
	}
}
