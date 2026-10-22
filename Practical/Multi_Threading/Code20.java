// Code -20
// Multi Threading
// Thread  Pool
// Code -4 
// State

class Demo {

	public static void main(String[] args){
	
		Thread mainThread = Thread.currentThread();

		Thread t1 = new Thread(() -> {
			System.out.println("Name of Current Thread is "+Thread.currentThread().getName());
			System.out.println("Main Thread state "+mainThread.getState());
		});
		System.out.println(t1.getState());

		// Runnable Stage
		t1.start();

		System.out.println(t1.getState()); // Runnable
	   
		try {
		
			Thread.sleep(2000);
		} catch(Exception e) { }

		System.out.println(t1.getState());// Terminating
	}
}
