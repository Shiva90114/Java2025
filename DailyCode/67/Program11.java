// Serialization

import java.io.*;
class Employee implements Serializable {

	int empId;
	String empName;
	Employee(int empId ,String empName){
	
		this.empId = empId;
		this.empName = empName;

	}
}
class SerialDemo{

	public static void main(String[] args)throws IOException{
	
		FileOutputStream fos = new FileOutputStream("EmployeeData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Employee obj1 = new Employee(1,"Kanha");
		Employee obj2 = new Employee(2,"Shiva");

		oos.writeObject(obj1);
		oos.writeObject(obj2);

		oos.close();
		fos.close();
	}
}

class  DserialDemo {

	public static void main(String[] args)throws Exception{
	
		FileInputStream fis = new FileInputStream("EmployeeData.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee fileObj1 =  (Employee)ois.readObject();
		Employee fileObj2 =  (Employee)ois.readObject();
	
		System.out.println(fileObj1.empId);   // 1
         	System.out.println(fileObj1.empName); // Kanha

		System.out.println(fileObj2.empId);   // 2
                System.out.println(fileObj2.empName); // Shiva

	}
}
/*
 Employee fileObj1 =  ois.readObject();
 Employee fileObj2 =  ois.readObject();

// error
// Program11.java:41: error: incompatible types: Object cannot be converted to Employee
                Employee fileObj1 =  ois.readObject();
                                                   ^
Program11.java:42: error: incompatible types: Object cannot be converted to Employee
                Employee fileObj2 =  ois.readObject();
                                                   ^
2 errors
*/
