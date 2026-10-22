// Code -5
// Multi Threading
// multiple thread
//Priority Thread
class MyThread extends Thread {

	public void run() {

	for(int i =0;i<10;i++){	
			System.out.println("In run :"+getName()); 
	}
	}
}
class Client {

	public static void main(String[] args) {
	
		MyThread t1 = new MyThread();
		// t1.setPriority(15);/
		/*Exception in thread "main" java.lang.IllegalArgumentException
                                     at java.lang.Thread.setPriority(Thread.java:1094)
                                      at Client.main(Code5.java:19)*/
		t1.setPriority(10);
		t1.start();
		System.out.println(Thread.currentThread());
		
		
	}
}
