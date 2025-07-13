//  get Method

class MyThread extends Thread {

	public void run(){
	for(int i=0;i<10;i++){
	System.out.println(getName());
	}
	}
}
class Client{

	public static void main(String[] args){
	MyThread t1 = new MyThread();
	t1.setPriority(15);  //Error
			     // 1 to 10
	t1.start();
	 
	MyThread t2 = new MyThread();
        t2.setPriority(7); 
        t2.start();
	}
}
