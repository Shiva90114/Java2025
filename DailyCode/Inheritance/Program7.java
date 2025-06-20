class Company{

  String cmpName = "Microsoft";
 String cmpLoc = "Pune";
 void cmpInfo(){
  System.out.println(cmpName);
    System.out.println(cmpLoc);

 }
 void changeData(String cmpLoc){
 this.cmpLoc = cmpLoc;
 }
}
class Client {
public static void main(String[] args){
       //  cmpInfo()                                //error         when not class
       //                                           // error       not find symbol
    Company obj = new Company();
    obj.cmpInfo();
     obj.changeData("PCMC");
    //  obj.changeData();                required string  found no argument
}

}
    /* public static void main(String[] args){                                                                                      
     company.cmpInfo();                            // error when not class
						   // error           not static to non static                                                                                                 }
*/


