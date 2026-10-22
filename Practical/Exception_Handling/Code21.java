// Code -21
//Exception Handling
//Interrupt
// 2.getMessage();

class Client {

    public static void main(String[] args) {

     // int x = 10 / 0;// Exception in thread "main" java.lang.ArithmeticException: / by zero
    try {
    
	    int x =10/0;
    
    }catch(Exception e) {
	    System.out.println(e.getMessage());// outpur -/ by zero
    }

    }
}
