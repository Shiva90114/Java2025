class Demo{
           int x=10;
	   int y=20;
	   void fun(){
	   
	   System.out.println("In fun");
	 
	   }
	       
	   void run(){

           System.out.println("In run");

           }  
	   public static void main(String[] args){
	  Demo obj = new Demo();
	  
	  System.out.println(obj.x);    //10
	  
	  System.out.println(obj.y);   //20
	 
          obj.fun();                   //In fun
	  obj.run();                   //In run
	   }


}
