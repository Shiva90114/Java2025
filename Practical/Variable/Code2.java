// Code-2 Variable
//
class Demo{

	int x=10;// Instance Variable
	int y=20;
	void fun(){
	
		System.out.println("In fun");
	}
	void run(){

                System.out.println("In Run");

	}
	public static void main(String[] args){
	
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);

		obj.fun();
		obj.run();
	}

}
