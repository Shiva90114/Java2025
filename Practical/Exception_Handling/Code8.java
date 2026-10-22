// Code -8
// Exception Handling
//Run time Exception
//Arithmetic Exception 


class Demo {


	public static void main(String[] args) {
	
		try {
		int a = 10;
		int b =0;

		int result =a/b; 
		System.out.println(result);
		} catch (ArithmeticException e) {
		
			System.out.println("Cannot Divide by Zero");
		}
	}
}
