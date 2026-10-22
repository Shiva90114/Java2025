// Code-1 Variable
//
class Demo{

	int x=10;// Instance Variable
	void fun(){
	
		System.out.println("In fun");
	}
	public static void main(String[] args){
	
		Demo obj = new Demo();
		System.out.println(obj.x);
		obj.fun();
	}

}
