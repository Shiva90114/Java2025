import java.util.concurrent.*;  

class ThreadTask   extends Thread{

	int taskCount;
	ThreadTask(int taskCount){
	
		this.taskCount = taskCount;
	}
	public void run() {
	
		System.out.println("Task  No. : "+taskCount+" Start with " + Thread.currentThread().getName());
	       work();
               System.out.println("Task  No. : "+taskCount+" End with " +Thread.currentThread().getName());
	}
	void work(){
	try{
	Thread.sleep(2000);

	}catch(Exception obj){
	
	}
	}
	
	

}
class ThreadPoolDemo {

	public static void main(String[] args)throws InterruptedException{
	
	       ExecutorService executor = Executors.newFixedThreadPool(3);
	       for(int i =1;i<=5;i++){
	       
		       ThreadTask tt = new ThreadTask(i);
		       executor.execute(tt);
	       }  
               Thread.sleep(12000);
	       System.out.println("Next Queue ....");
	       for(int i=6;i<=10;i++){
	          ThreadTask tt = new ThreadTask(i);
                  executor.execute(tt);
	      }	       
	 executor.shutdown();
	}
}
