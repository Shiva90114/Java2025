class Demo{
            
	int x=10;
	int y=20;
	void fun() {
		System.out.println("In fun");
	}
	void run(){
	System.out.println("In run");
	}
	
	
	public static void main(String[] args){
        Demo obj = new Demo();
		System.out.println(obj.x);
              System.out.println(obj.y);
		obj.fun();
	      obj.run();	

	    
	    
	    }


}
