// NullPointerException

class Demo {

	void fun() {
	                   System.out.println("In fun");
	}

	 void run() {

                           System.out.println("In run");
        }
}
class Client {
	public static void mian(String[] args){
		Demo obj = new Demo();
		obj.fun();

		obj = null;
		obj.run;
	}
}
// Exception 
// null
