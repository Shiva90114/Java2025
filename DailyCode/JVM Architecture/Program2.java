class Demo {

	int x=10;
	static int y =20;

	static {
	
		System.out.println("In Static");
	}
	void fun() {
                                                                                                                                                                            System.out.println("In fun");                                                                                                                    }
	static void run() {
                                                                                                                                                                            System.out.println("In void run");                                                                                                                    }
               
}
class DemoChild extends Demo{

	DemoChild(){
	
		System.out.println("Constructor DemoChild");
	}

}
class Client {

	static{
	
		System.out.println("In static Client");
	}
	public static void main(String[] args){
	
	        System.out.println("In Main Method");
		Demo obj = new Demo();
	//	obj.fun();
	//      obj.run();

	//	DemoChild obj2 = new DemoChild();	

	}
}
