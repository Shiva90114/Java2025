// Code -6  -Static
//
class Demo {

	static int x=10;//2
	static{
// 1	
		System.out.println("In Static Block");
	//	System.exit(); // in system
	}
	static void fun(){
	// 3
		System.out.println("In static fun");
	}
	public static void main(String[] args){
	
		System.out.println(x);
		fun();

	}
}
