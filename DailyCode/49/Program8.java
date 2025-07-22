import java.util.concurrent.*;

class ThreadTask extends Thread {

	int taskCount;
	ThreadTask(int taskCount){
	
		this.taskCount= taskCount;
	}
	public void run(){
	System.out.println("TaskNo. : "+ taskCount + "Start with "+Thread.currentThread().getName());
	try{
	Thread.sleep(2000);
	}catch(InterruptedException ie){
	
	}
	System.out.println("TaskNo. : "+ taskCount + "End with "+Thread.currentThread().getName());
	}
}
class ScheduledPoolDemo {

	public static void main(String[] args){
	
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
		for(int i=0;i<=5;i++){
		ThreadTask task = new ThreadTask(i);
		executor.schedule(task,5,TimeUnit.SECONDS);
		}
		executor.shutdown();
	}

}
