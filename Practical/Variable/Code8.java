// Code -8
//
class Demo{

	int x =10;
	static int y =20;
	void fun(){
	
		System.out.println("In Fun");
	}
	static void run(){

                System.out.println("In Run");
        }
	public static void main(String[] arg){

		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(y);
		obj.fun();
		run();
	}
}
