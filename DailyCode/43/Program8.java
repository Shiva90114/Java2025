// Lambda Function 1.8

interface Demo {

	void fun();
}

class Client {

	public static void main(String[] args){
	
	         Demo obj1 = ()->System.out.println("In Fun");
	         obj1.fun();  
	}

}
