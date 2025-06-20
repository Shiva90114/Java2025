class Demo {
        void fun(double x){
	 
		System.out.println("Double");
	 
	}
	 void fun(double ... x){

                System.out.println("Var-args");                                                                                                                                                                                       }
}
class Client {
 public static void main(String[] args){
 
             Demo obj = new Demo();
         //      double    obj.fun('A');
	     obj.fun(10);          // 10.5,10,
          obj.fun();
	  obj.fun(10,20);
 }

}
