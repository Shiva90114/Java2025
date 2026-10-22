// Code -2  Constructor
//

class Employee{
	int empId;   // Instance
	String empName;//Instance

	void empInfo(int empId,String empName){
	
		System.out.println(empId);
		System.out.println(empName);
		this.empId=empId;
		this.empName = empName;
		System.out.println("--");
		System.out.println(this.empId);
		System.out.println(this.empName);
	}
}
class Client{

       public static void main(String[] args){
                Employee obj = new Employee();
		obj.empInfo(100,"Shiva");
       }
        
}
