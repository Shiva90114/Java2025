class MyThread extends Thread {

	public void run() {
	try{
	for(int i =0;i<10;i++){
	System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
       	}
	}catch(InterruptedException ie){
	
	}
	}
}
class Client {

	public static void main(String[] args)throws InterruptedException{
		MyThread mt = new MyThread();
		mt.start();
		mt.join();
		for(int i =0;i<=10;i++){
		System.out.println(Thread.currentThread().getName());
		}
	
	}
}
