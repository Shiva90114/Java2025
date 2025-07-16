class MyThread extends Thread {

	public void run(){
	try{	
		for(int i =0;i<10;i++){
		
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName());
		}  }catch(InterruptedException ie){
			
			}
		
		}
}
class Client {

	public static void main(String[] args)throws InterruptedException{
	
		MyThread t1 = new MyThread();
                t1.start();
		for(int i=0;i<10;i++){
		 
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName());
		 
		}
	}
}

