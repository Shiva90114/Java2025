// Code -21
// Multi Threading
// Thread  Group
// Code -1

import java.util.concurrent.*;
class MyThread extends Thread {
	MyThread(ThreadGroup tg,String str) {
	
		super(tg,str);
	}

}

class Client {

	public static void main(String[] args){
	
		ThreadGroup tg = new ThreadGroup("Core2Web");
		ThreadGroup tg2 = new ThreadGroup("Incubator");
	

		System.out.println(Thread.currentThread().getThreadGroup());

		MyThread t1 = new MyThread(tg,"Java");
		System.out.println(t1.getThreadGroup());
		System.out.println(t1.getName());

		MyThread t2 = new MyThread(tg,"Flutter");
		System.out.println(t2.getThreadGroup());
                System.out.println(t2.getName());

		// SubGroup
		ThreadGroup tg3 = new ThreadGroup(tg,"C++");
		System.out.println(tg3.getParent());
                System.out.println(tg3.getName()); // subgroup
		System.out.println(tg3.getParent().getName()); // parent 


	}
}
