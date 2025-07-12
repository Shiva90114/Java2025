// InputMismatch

import java.util.*;
class Demo {


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int Data");
	        int x = sc.nextInt();
		System.out.println("Input :"+ x);

	}
}

/* Exception
 
   Exception in thread "main" java.util.InputMismatchException
        at java.util.Scanner.throwFor(Scanner.java:864)
        at java.util.Scanner.next(Scanner.java:1485)
        at java.util.Scanner.nextInt(Scanner.java:2117)
        at java.util.Scanner.nextInt(Scanner.java:2076)
        at Demo.main(Program10.java:9)
	
	* /
