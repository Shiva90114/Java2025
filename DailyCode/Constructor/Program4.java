class Demo{
           int x=10;// instance(stroe in object)
	   
 
	   {
           System.out.println("In Instance block1");
	   }
	   Demo(){
	   
	   System.out.println("In constructor");

	   }
	   void fun(){
	   System.out.println("Instance method");
	   }

	   	   public static void main(String[] args){
          Demo obj = new Demo();
	  obj.fun();
     }	   


}
