// Scanner Class

import java.util.Scanner;

class Demo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Society Name");
	        String socName = sc.next();

	       System.out.println("Enter Socity Wing : ");
               char wing = sc.next().charAt(0);

               System.out.println("Enter Flat Number : ");
               int flatNum = sc.nextInt();

               System.out.println("Enter Flat rent : ");
               float rent = sc.nextInt();
             
              System.out.println("Scoiety Name - "+socName);
              System.out.println("Scoiety Wing - "+wing);
              System.out.println("Scoiety Flat number - "+flatNum);
              System.out.println("Flat Rent - "+rent);	      
	}
}
