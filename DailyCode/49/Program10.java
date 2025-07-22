// Thread Group
class MyThread extends Thread {

	MyThread(ThreadGroup tg,String str){
	super(tg,str);
	}
}


class Client {

	public static void main(String[] args){
		ThreadGroup tg = new ThreadGroup("Core2Web");
	        ThreadGroup tg2 = new ThreadGroup("Incubators");
	  // sub group 
	      //  ThreadGroup tg3 = new ThreadGroup(tg,"C++");
		MyThread t1 = new MyThread(tg,"Java");
		System.out.println(t1.getThreadGroup());
		System.out.println(t1.getName());
		
		MyThread t2 = new MyThread(tg,"Flutter");
                System.out.println(t2.getThreadGroup());
                System.out.println(t2.getName());

	      	
	}
}
