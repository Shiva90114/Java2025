// Thread Class

class MyThread extends Thread {

	public void run() {
	
		for(int i =0;i<=10;i++){
		System.out.println(Thread.currentThread().getName());
		 System.out.println(getName());
		}
	}
}
class Client {

	public static void main(String[] args){
	MyThread t1 = new MyThread();
	t1.start();
	 MyThread t2 = new MyThread();
        t2.start();
	for(int i =0;i<=10;i++){	
		System.out.println(Thread.currentThread().getName());
	}
	}
}
