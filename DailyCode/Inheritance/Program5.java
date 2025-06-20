import java.util.*;

class Employee{
     int empId;          
     String empName;     
      Employee(int empId,String empName){         //(int id,String name)
      this.empId = empId;                                // empId = id;
      this.empName = empName;                    // empName = name;
      System.out.println("Para Constructor");
      }


  void empInfo() {
     System.out.println(empId);
     System.out.println(empName);
  
  }
}
 class Client {
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter empId");
		 int empId = sc.nextInt();
		System.out.println("Enter empName");
                 String empName = sc.next();
	 Employee obj = new Employee(empId,empName);
	 
	 sc.close();
	 obj.empInfo();
	 }


}
