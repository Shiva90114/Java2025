

class Demo {

	void fun(){
	
	}
	public static void main(String[] args){
	
		Demo obj = new Demo();
		obj.fun();

		obj = null;
		try{
		obj.fun();
		}catch(RuntimeException ae){
		    System.out.println("Runtime Exception1");
		
		}catch(ArithmeticException obj1){
		    System.out.println("Arith Exception2");
		
		}catch(NullPointerException obj2){
		   System.out.println("Null Exception3");
		}catch(Exception obj3){
	           System.out.println("Exception");
		}

	}
}
/*
 * Program4.java:19: error: exception ArithmeticException has already been caught
                }catch(ArithmeticException obj1){
                 ^
Program4.java:22: error: exception NullPointerException has already been caught
                }catch(NullPointerException obj2){
                 ^
2 errors
*/

