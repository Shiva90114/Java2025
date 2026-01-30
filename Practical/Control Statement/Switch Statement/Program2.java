// Switch Statement
// JDK 12 (2019)
import java.util.*;
class Bank{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Welcome");

	System.out.println("1. Check Balance");
	System.out.println("2. Deposit Money");
	System.out.println("3. Withdraw Money");
	System.out.println();
	System.out.println("Enter Your Choice :");
        int choice = sc.nextInt();

	switch (choice) {
	
		case 1 -> System.out.println("Your Balance is $100");
		case 2 -> System.out.println("Money Deposit Successfully");
                
		case 3 -> System.out.println("Money Withdrawn Successfully");
                default -> System.out.println("Invalid Input");
	}
	}
}
