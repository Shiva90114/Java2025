class MyThread implements Runnable {
	public void run(){
	
		System.out.println(Thread.currentThread().getName());
		try{
		Thread.sleep(5000);
		}catch(InterruptedException ie){
		}
	}
}
class Client{

	public static void main(String[] args)throws InterruptedException{
	
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		t1.start();
                
		t1.join();
		//Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName());
	}
}
