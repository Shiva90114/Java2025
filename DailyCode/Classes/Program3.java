class Demo{
           int x=10;
	   static int y=20;
	   void fun(){
	   
	   System.out.println("In fun");
	 
	   }
	       
	   static void run(){

           System.out.println("In run");

           }  
	   public static void main(String[] args){
	  Demo obj = new Demo();
	  
	  System.out.println(obj.x);    //10
	  
	  System.out.println(y);   //20
	 
          obj.fun();                   //In fun
	  run();                   //In run
	   }


}
