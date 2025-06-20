class BMW {
     int foundationYear = 1916;
     String foundationCountry = "Germany";
     BMW(){
      System.out.println("The ultimate Driving machine");
     
     }
   
     void dispInfo() {
     System.out.println("Foundation Year ; "+foundationYear);
       System.out.println("Foundation Country ; "+foundationCountry);
     }

}
class Client {



public static void maim(String[] args){
           BMW car = new  BMW();
	   car.dispInfo();

}

}
                 // error
//
