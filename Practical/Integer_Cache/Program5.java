// Integer Cache
// Code - 5
class Demo {

	public static void main(String[] args) {
	
		Integer x = 100; 
		Integer y= 100;// same address 
	        
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
			
              
	}
}
