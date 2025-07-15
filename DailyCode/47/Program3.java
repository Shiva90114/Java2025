class Demo {

	void fun(Exception obj){
	
	}
}

class Client {

	public static void main(String[] args){
	
		Demo obj = new Demo();
		new Demo().fun(new ArithmeticException());
		
	}
}


