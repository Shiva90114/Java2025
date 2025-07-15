class Demo {

	void fun(Runnable obj){
	
	}
}

class Client {

	public static void main(String[] args){
	
		Demo obj = new Demo();
		new Demo().fun(new Runnable(){
		
			public void run() {
			
			}
		});
		
	}
}

