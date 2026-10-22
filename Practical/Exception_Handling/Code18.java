// Code -18
// Exception Handling
//Run time Exception
//InputMismatchException


import java.util.Scanner;
class Demo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try {
		   	 System.out.println("Enter Age:");
			 int age = sc.nextInt();
	            	 System.out.println("Age:"+age);
		}catch (java.util.InputMismatchException e) {
			
			System.out.println("Please enter Valide Input");
       
		}
						   
         }
}
