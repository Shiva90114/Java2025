class Employee{
       int empId;                 // 0
       String empName;             // null
       void empInfo(int empId,String empName){
       System.out.println(this.empId);        // 0
       System.out.println(this.empName);      // null
	  this.empId = empId;              // instance store
          this.empName = empName;         // svata madhe

       System.out.println(this.empId);
       System.out.println(this.empName);
       }
    public static void main(String[] args){
    Employee obj = new Employee();
    obj.empInfo(10,"Kanha");
    
    }
          

}
