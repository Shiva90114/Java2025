// Code -11
// Multi Threading
// Thread Life Cycle
// Thread
class MyThread extends Thread {
	public void run() {
	 
		try {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
			
			
				Thread.sleep(1000);
			}
		} catch(Exception e){
			

	}
		
	}

	
}
class Client {

	public static void main(String[] args) throws InterruptedException {
	
		MyThread mt = new MyThread();
		mt.start(); 
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
                        Thread.sleep(1000);
		}
	}
}
