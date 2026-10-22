// Code -20
//Exception Handling
//Interrupt
// 1.printStackTrace();

class Client {

    public static void main(String[] args) {

    //    int x = 10 / 0;// errorException in thread "main" java.lang.ArithmeticException: / by zero
    try {
    
	    int x =10/0;
    
    }catch(Exception e) {
	    e.printStackTrace();// outpur -java.lang.ArithmeticException: / by zero
    }

    }
}
