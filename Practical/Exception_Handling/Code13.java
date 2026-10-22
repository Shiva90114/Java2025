// Code -13
// Exception Handling
//Run time Exception
//OutOfIndex Exception 
//String
//

class Demo {


	public static void main(String[] args) {
	
		String name ="Java";

		
		System.out.println(name.charAt(4));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4
                                                  //      at java.lang.String.charAt(String.java:658)
                                                 //  at Demo.main(Code13.java:16)
						   
         }
}
