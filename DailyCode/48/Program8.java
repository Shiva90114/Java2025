// Interrupted 
class MyThread extends Thread {

	public void run() {
	
		while(true){
		
			System.out.println(getName());
		        try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
                                 break;// rpeat code stop			
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
/*Thread-0
Thread-0
java.lang.InterruptedException: sleep interrupted
        at java.lang.Thread.sleep(Native Method)
        at MyThread.run(Program8.java:10)
	*/

