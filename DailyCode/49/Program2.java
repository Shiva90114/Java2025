// Threadpool

import java.util.concurrent.*;  // 

class ThreadTask  implements Runnable{

	int taskCount;
	ThreadTask(int taskCount){
	
		this.taskCount = taskCount;
	}
	public void run() {
	
		System.out.println("Task Start No. : "+taskCount+"Start with " + Thread.currentThread().getName());
		try {
	             Thread.sleep(3000);	
		}catch(InterruptedException ie){
		
		}
               System.out.println("Task Start No. : "+taskCount+"Start End " +Thread.currentThread().getName());
	}
	

}
class ThreadPoolDemo {

	public static void main(String[] args){
	
	       ThreadPoolExecutor obj = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);
               for(int i =1;i<=5;i++){
	       
		       ThreadTask tt = new ThreadTask(i);
		       obj.execute(tt);
	       }   	       
	 obj.shutdown();
	}
}
