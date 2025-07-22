// Interrupted 
class MyThread extends Thread {

	public void run() {
	
		while(true){
		
			System.out.println(getName());
		        try{
				Thread.sleep(1000);
			}catch(
			System.out.println("Interrupted occured ..");
                        break;
			}
		}
	}
}
class Client {

	public static void main(String[] args)throws InterruptedException {
	MyThread t1 = new MyThread();
        t1.start();
	
	Thread.sleep(2000);
	
	t1.interrupt();
	}
}
