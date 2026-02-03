// Integer Cache
// Code - 4
class Demo {

	public static void main(String[] args) {
	
		Integer x = new Integer(100); 
		Integer y= new Integer(100); 
	        System.out.println("X= 100 Y = 100");
		// if(x==y){   // compare address
		if(x.equals(y)){ // Compare value
	        	System.out.println("X==Y");
		} else {
                      System.out.println("X =! y");
                }

                Integer m = new Integer(200); 
                Integer n= new Integer(200); 
                System.out.println("M= 200 N = 200");
                // if(x==y){ //  compare address
		if(m.equals(n)){ // Compare  value
		      System.out.println("M == N");
		}else {
		      System.out.println("M =! N");
		}
	}
}
