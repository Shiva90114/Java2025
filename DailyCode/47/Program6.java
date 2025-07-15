class MyThread implements Runnable {

	public void run() {
	
	}
   
        
    }

class Client {
    public static void main(String[] args){
          MyThread mt = new MyThread();
	  Thread t1 = new Thread(mt);
	  t1.start();
       }
    }

