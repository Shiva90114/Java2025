class Employee{

 static int empId;
 static String empName;
 static void empInfo(){
 System.out.println(empId); //0
 System.out.println(empName);//null
 
 }
}

class Client{

  public static void maim(String[] args){
 //    Employee obj = new Employee();               ?
   //  Employee.obj.empInfo();                     ?
   Employee.empInfo();
  }
}
