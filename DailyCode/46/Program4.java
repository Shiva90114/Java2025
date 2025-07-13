//  get Method

class MyThread extends Thread {

	MyThread(String name){
	
		super(name);

	}
	public void run(){
	System.out.println(getName());
	}
}
class Client{

	public static void main(String[] args){
	MyThread t1 = new MyThread("Core2Web");
	t1.start();
	}
}
