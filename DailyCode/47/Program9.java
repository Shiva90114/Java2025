class MyThread implements Runnable {

	public void run(){
		for(int i =0;i<10;i++){
		
			System.out.println(Thread.currentThread().getName());
			try{
			   Thread.sleep(1000);
			}catch(Exception e){
			
			}
		
		}
	
	} 
}
class Client {

	public static void main(String[] args)throws InterruptedException{
	
		MyThread mt = new MyThread();
                Thread t1 = new Thread(mt);
		t1.start();
		for(int i=0;i<10;i++){
		 System.out.println(Thread.currentThread().getName());
		 Thread.sleep(1000);
		}
	}
}
// not use throws in MyThread class
// use Try catch
