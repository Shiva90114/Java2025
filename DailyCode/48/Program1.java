class MyThread extends Thread {
          public void run() {
	  
		  System.out.println(getName());
		  try{
		  Thread.sleep(2000);
		  }catch(InterruptedException ie){
		  
		  }
	  }

}



class Client {

	public static void main(String[] args){
	
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();                                                                 t2.start();

		System.out.println(Thread.currentThread().getName());
	}
}
