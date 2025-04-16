class Demo{
           int x=10;// instance(stroe in object)
	   static int y=20;    // statici(stroe in static block)
     
	   static{
		//  static int y=20;   
	   System.out.println("In Static Block");
	   }
	   {
           System.out.println("In Instance block");
	   }
	   Demo(){
	   
	   System.out.println("In constructor");

	   }
	   void fun(){
	   System.out.println("Instance method");
	   }
	   static  void run(){
           System.out.println("Static method");
           }
	   public static void main(String[] args){
     // not any memory for x
     System.out.println("In main");
     run();
     Demo obj = new Demo();
     obj.fun();
     }	   


}
