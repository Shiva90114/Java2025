// Code -17
// Multi Threading
// Thread  Pool
//

import java.util.concurrent.*;

class ThreadTask extends Thread {
	int taskCount;

	ThreadTask(int taskCount){
	
		this.taskCount=taskCount;
	}
	public void run() {
		System.out.println("Task No. "+taskCount+"start with:"+Thread.currentThread().getName());
		work();
		System.out.println("Task No. "+taskCount+"start with:"+getName());
	}
	void work(){
	
		try {
			Thread.sleep(3000);
		} catch(Exception obj){	
		}
	}
}
class Client {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor =Executors.newFixedThreadPool(3);
		
	        for(int i =0;i<10;i++) {	
		
			ThreadTask tt = new ThreadTask(i);
			executor.execute(tt);
		}
		executor.shutdown();
	}
}
