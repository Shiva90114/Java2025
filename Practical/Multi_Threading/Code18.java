// Code -18
// Multi Threading
// Thread  Pool
// Code -2

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
	        ExecutorService executor1 = Executors.newCachedThreadPool();
                ExecutorService exeutor = Executors.newSingleThreadExecutor();
		
	}
}
