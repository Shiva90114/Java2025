// Code -14
// Exception Handling
//Run time Exception
//OutOfIndex Exception 
//String

class Demo {


	public static void main(String[] args) {
	
		String name ="Java";
                  
		try {
		
		System.out.println(name.charAt(4));

		} catch(StringIndexOutOfBoundsException e){ 
                                        System.out.println("Invalid Index");
			
		          	
		}			
         }
}
