// Code -17
// Exception Handling
//Run time Exception
//InputMismatchException
//

import java.util.Scanner;
class Demo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();/* Exception in thread "main" java.util.InputMismatchException
                                          at java.util.Scanner.throwFor(Scanner.java:864)
                                          at java.util.Scanner.next(Scanner.java:1485)
                                          at java.util.Scanner.nextInt(Scanner.java:2117)
                                          at java.util.Scanner.nextInt(Scanner.java:2076)
                                          at Demo.main(Code17.java:14)
		*/

		System.out.println("Age:"+age);
		
						   
         }
}
