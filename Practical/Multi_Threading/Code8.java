// Code -8
// Multi Threading
// multiple thread

class Demo {

	void fun (Exception obj) {
	
	}
}
class Client {

	public static void main(String[] args) {
	
		Demo obj =new Demo();
		obj.fun(new Exception());
		obj.fun(new ArithmeticException());
                new Demo().fun(new ArithmeticException());
		 // new Demo().fun(new Runnable(){public void run(){ }}); // anonymous object of Runnable
		/*error: incompatible types: <anonymous Runnable> cannot be converted to Exception
                                                                      new Demo().fun(new Runnable(){public void run(){ }});
                                                                      Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
									*/
	}
}
