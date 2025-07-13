class MyThread extends Thread {

	public void run(){
	System.out.println("In run :" + getName());
	}

}
class Client {

	public static void main(String[] args){
	MyThread t1 = new MyThread();
        //   System.out.println(Thread.currentThread());
	
        t1.setName("Core2Web");
	t1.start();

        MyThread t2 = new MyThread();                                                                                                t2.setName("Incubators");                                                                                                    t2.start();
	}
}
