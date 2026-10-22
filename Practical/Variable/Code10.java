// Code -10

class Demo{

	int x=10;
	static int y=20;
	static{
	
		System.out.println("In static Block");
	}
	{
	
		System.out.println("In Instance Block");
	}
	Demo(){
	
		System.out.println("In Constuctor");
	}
	void fun(){
	
		System.out.println("In Instance Method");
	}
	static void run(){
	
		System.out.println("In Static Method");
	}
	public static void main(String[] args) {
	
		System.out.println("In main");
		run();
		Demo obj = new Demo();
		obj.fun();


	}
}
