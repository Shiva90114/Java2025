// Scanner Class

import java.util.Scanner;
class Demo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Company Name : ");
	        String compName = sc.next();

        	System.out.println("Enter Location : ");
        	String location = sc.next();

	        System.out.println("Enter Employee Count : ");
	        int empCount = sc.nextInt();
	
        	System.out.println("Enter Salary : ");
	        float salary = sc.nextFloat();

		System.out.println("Company Name : "+compName);
		System.out.println("Location : "+location);
		System.out.println("Employee Count : "+empCount);
		System.out.println("Salary : "+salary);
	
	}
}
