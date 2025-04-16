class Demo{
           int x=10;
	   static int y=20;
	   void fun(){
	   
	   System.out.println("In fun");
	   System.out.println(x);
	   //System.out.println(y); 
	   }
	   
	   public static void main(String[] args){
	  Demo obj = new Demo();
	  
	  System.out.println(obj.x);
	  
	  System.out.println(y);
	  //System.out.println(obj.y);
          obj.fun();
	   }


}
