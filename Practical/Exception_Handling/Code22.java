// Code -22
//Exception Handling
//Interrupt
// 3.toString();

class Client {

    public static void main(String[] args) {

     // int x = 10 / 0;// Exception in thread "main" java.lang.ArithmeticException: / by zero
    try {
    
	    int x =10/0;
    
    }catch(Exception e) {
	    System.out.println(e.toString());//
    }

    }
}
// output -
// java.lang.ArithmeticException: / by zero
