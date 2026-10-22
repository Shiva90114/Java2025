// Code -7 Static
//
class Demo {

	int x=10;
        static int y =20;
	void fun(){
	
		System.out.println("In  fun");
	}
	public static void main(String[] args){
	
		Demo obj=new Demo();
		System.out.println(obj.x);
		System.out.println(y); // Direct Call
		obj.fun();

	}
}
