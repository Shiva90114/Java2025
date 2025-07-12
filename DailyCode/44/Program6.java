 // ArithmeticException
 
class Demo{

	static void run() {
	        System.out.println("Start run");
	        System.out.println(10/0);
	        System.out.println("End run");
	}
	
	static void fun() {
                System.out.println("Start fun");
                run();
                System.out.println("End fun");
        }
	public static void main(String[] args){
         
         System.out.println("Start main");
	 fun();
         System.out.println("End main");
        } 
}
