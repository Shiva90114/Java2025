class MyThread implements Runnable {

    public void run(){
	    for(int i = 0;i<10;i++){
	    
	    System.out.println(Thread.currentThread().getName());
	    }
        
    }
}

class Client {
    public static void main(String[] args){

      MyThread mt = new MyThread();
      Thread t1 = new Thread(mt);      
      t1.start();                  
	 
    }
    
}
// 
//  Thread$0 Obj
// Thread t1 = new Thread();
