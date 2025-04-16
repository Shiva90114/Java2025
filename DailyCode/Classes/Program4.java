class Demo{
              int x=10;
	      static int y=10;
	      static{
	       System.out.println("Static block1");
	      }
        Demo(){
	   System.out.println("Constructor");
	
	}
	static void run(){
	
	System.out.println("In fun");
	}
	void fun(){
	System.out.println("In fun");
	// static int b=20;                      // error illegal start of expression
	}
    public static void main(String[] args){
    
    
    int a=10;
    //static int b=20;                        //error not stayic
    Demo obj = new Demo();
    obj.run();
    obj.fun();
    
    
    
    }


    static{
    
    
    System.out.println("Static Block2");}
}
