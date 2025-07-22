// Thread Group


class MyThread extends Thread {

}
class Client {

	public static void main(String[] args){
	
		

		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread());
		 
	}
}
