class Demo {
         void fun(int x,float y){
	 System.out.println("Int-Float");
	 
	 }
	   void fun(float x,int y){
         System.out.println("Float-Int");

         }

}
class Client{
             public static void main(String[] args){
             
             Demo obj = new Demo();
               obj.fun(10,10);        // error
				      // Ambigous
	     
	     }	     
	     

}
