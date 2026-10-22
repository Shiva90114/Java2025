// Codde - 4 Constuctor 
//

class Company{

	String compName="Microsoft";
	String compLoc ="Pune";

	void compInfo(){
	
		System.out.println(compName);
		System.out.println(compLoc);
	}
}
class Employee extends Company{

	String empName="Ashish";
	double empSal=2.5;
	void empInfo(){
	
		System.out.println(empName);
		System.out.println(empSal);
	}
}
class Client{

	public static void main(String[] args){
	
		Company comp = new Company();
		comp.compInfo();

		Employee emp = new Employee();
		emp.empInfo();
		emp.empInfo();
	}
}
