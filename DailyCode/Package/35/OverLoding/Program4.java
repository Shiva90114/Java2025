class Demo {
           void fun(int x) {
	   System.out.println("Int ");
	   }
	   void fun(float x) {
           System.out.println("Float");                                                                                                                                                                                                 }
}
class Client {
             public static void main(String[] args){
	     Demo obj = new Demo();
	     obj.fun(10);             // Int
	     obj.fun(10.5f);          // Float  
	     
	     obj.fun('A');            // Int
	   //                                             obj.fun(10.5);           // Error
	     obj.fun(10l);            //Float
	     
	     }

}
