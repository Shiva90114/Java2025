class MyThread extends Thread {

    public void run(){
	    for(int i = 0;i<10;i++){
	    
	    System.out.println(getName());}
        
    }
}

class Client {
    public static void main(String[] args){

      MyThread mt = new MyThread();	     //Thread Creation
      mt.start();                     // Ready run
	 for(int i = 0;i<10;i++){

            System.out.println(Thread.currentThread().getName());}

    }
    }

