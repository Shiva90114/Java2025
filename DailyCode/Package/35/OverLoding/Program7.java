import java.util.*;
class Demo {
        void fun(String x) {
	 System.out.println("String");
	}
	 void fun(Object sb) {
         System.out.println("Object");                                                                                }
}


class Client  {
               public static void main(String[] args){
	       
		       Demo obj = new Demo();

		       obj.fun("Shashi");        // String
		      obj.fun(new Object());     //    
		      obj.fun(null);          // not error *1st child
	       }

}
