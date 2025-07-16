
class Client {

	public static void main(String[] args){
	
	     Runnable obj = new Runnable(){	
		public void run(){
		     	System.out.println(Thread.currentThread().getName());
		} };
	     Thread t1 = new Thread(obj);
	     t1.start();
	     System.out.println(Thread.currentThread().getName());
		}
	}

  
// code in only one class 
//
// for Multi thread  
