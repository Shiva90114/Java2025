

class Demo{


	
	void fun(){
			System.out.println("In Fun");
	}

	static void run(){
	
		System.out.println("In Run");
	
	}
	public static void main(String[] args){
	
		run();
		Demo obj = new Demo();
		obj.fun();

	
	}

}
