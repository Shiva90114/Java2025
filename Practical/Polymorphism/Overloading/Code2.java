// Code -2
// Polymorphism
// Overloading
//

class Demo{

	void fun(int x){
		System.out.println("Int - Method ");
	
	}
	void fun(float y){
                System.out.println("Float - Method ");

        }
}

class Client {

	public static void main(String[] args) {
	
		Demo obj = new Demo();
		obj.fun(10);
		obj.fun(10.5f);
		// obj.fun(10.5);// error -possible lossy conversion from double to float)
		//obj.fun("A"); // error: no suitable method found for fun(String)
	}
}
