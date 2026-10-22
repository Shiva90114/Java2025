// Code -12
// Multi Threading
// Thread Life Cycle
// Thread
class MyThread extends Thread {
	public void run() {
	 
		while(true){
			System.out.println(getName());
			try {
			System.out.println(Thread.currentThread().getName());
		
				Thread.sleep(15000);	
		        } catch(Exception e){
		}

	}
		
	}

	
}
class Client {

	public static void main(String[] args) throws InterruptedException {
	
		MyThread mt = new MyThread();
		mt.setDaemon(true); // if line comment then output not stop
		mt.start(); 
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
                        Thread.sleep(12000);
		}
	}
}
