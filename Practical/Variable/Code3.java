// Code-3 Variable
//
class Demo{

	int x=10;// Instance Variable
	int y=20;
	void fun(){

		System.out.println(x);// this.x
		System.out.println(y);// this.y
		System.out.println("In fun");
	}
	
	public static void main(String[] args){
	
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);

		obj.fun();
		
	}

}
