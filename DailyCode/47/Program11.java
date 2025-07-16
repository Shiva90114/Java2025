// Doemon Thread

class MyThread extends Thread {

	public void run(){
        while(true){	
		
			System.out.println(Thread.currentThread().getName());
	         
         try{
	 Thread.sleep(500);
	 	 }catch(InterruptedException ie){
	 
		 }}
	}
}
class Client {

	public static void main(String[] args)throws InterruptedException{
	
		
		MyThread mt = new MyThread();
                 mt.setDaemon(true);        
		mt.start();
	
		for(int i=0;i<10;i++){
		 
			
			System.out.println(Thread.currentThread().getName());
		        Thread.sleep(2000);
		}
	}
}

