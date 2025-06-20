
class Demo {
        void fun(String x) {
	 System.out.println("String");
	}
	 void fun(StringBuffer sb) {
         System.out.println("StringBuffer");                                                                                }
}


class Client  {
               public static void main(String[] args){
	       Demo obj = new Demo();
	       //   obj.fun();                  //error 
	      obj.fun("Shashi");                             // String
	      obj.fun(new StringBuffer("Shashi"));          // StringBuffer
	      obj.fun(new String("Shashi"));               // String     
	      obj.fun(null);             // error // ambiguous
					 //            ` both string & stringBuffer
	       }

}
