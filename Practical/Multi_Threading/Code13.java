// Code -13
// Multi Threading
// Thread Life Cycle
// Runnable
class Demo implements Runnable {
	public void run() {
	}	
}
class Client {

	public static void main(String[] args) throws InterruptedException {
	
		Runnable obj = new Runnable(){
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t1 = new Thread(obj);
		t1.start(); 
        	System.out.println(Thread.currentThread().getName());
	}
}
