
// Runnable Method
// use extends class 

class MyThread implements Runnable {

	public void run() {
	
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
	}

class Client{

	public static void main(String[] args){
	MyThread mt = new MyThread();
	Thread t1 = new Thread(); 
	t1.start();
	 
	 System.out.println(Thread.currentThread().getName());
	}
}
