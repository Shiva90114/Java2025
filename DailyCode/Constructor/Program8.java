// Constructor
class  Demo{
           Demo(){       // when Demo()
	   // this();   // error
	   // this(10);
		   System.out.println("Non-arg Constructor");
	   }   
	   Demo(int x){  // Demo(10)
           this();
		   System.out.println("Parameterized Constructor");
           // this(10);                    // error
	   }
	   public static void main(String[] args){
	   Demo obj=new Demo(10);
	   }
	   







}
