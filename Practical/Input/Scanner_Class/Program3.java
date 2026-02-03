// Scanner Class

import java.util.Scanner;
class Demo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Name : ");
	        String name = sc.next();

        	System.out.println("Enter Wing : ");
        	char wing = sc.next().charAt(0);

	        System.out.println("Enter Flat Number: ");
	        int flatNo = sc.nextInt();
	
        	System.out.println("Enter Rent : ");
	        float rent = sc.nextFloat();

		System.out.println(name);
		System.out.println(wing);
		System.out.println(flatNo);
		System.out.println(rent);
	
	}
}
