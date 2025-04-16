// Static



class Demo{
           
	   static int y=20;    // statici(stroe in static block)
     
	   static{
	   // tatic int y=10;             //error
	   	   System.out.println(y);
		   //  static int y=20;   
	   System.out.println("In Static Block");
	   }
	   
           

	  
	   static  void run(){
           System.out.println("Static method");
           }
	   
	   public static void main(String[] args){
     // not any memory for x
      System.out.println(y);
		System.out.println("In main");
     run();
     }	   


}
//Static varible
//Static block refernce Store
//Static method
