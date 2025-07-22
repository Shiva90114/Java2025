class MyThread extends Thread {

	public void run() {
	
		while(true){
		
			System.out.println(getName());
		}
	}
}
class Client {

	public static void main(String[] args){
	MyThread t1 = new MyThread();
        t1.start();
	}
}
