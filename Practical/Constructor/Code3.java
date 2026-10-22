// Code -3 Constructor
//

import java.util.*;
class Employee{

	int empId;
	String empName;

	Employee(int empId,String empName){
	
		this.empId=empId;
		this.empName=empName;

		System.out.println("Para Constructor");
	}

	void empInfo() {
	
		System.out.println(empId);
		System.out.println(empName);
	}
}
class Client {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Name :");
                String empName = sc.next();

		Employee obj = new Employee(empId,empName);

		sc.close();
		obj.empInfo();
	}
}
