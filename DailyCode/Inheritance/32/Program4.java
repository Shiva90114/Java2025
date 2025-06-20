class BMW {
     int foundationYear;
     String foundationCountry;
     
     
     BMW(int foundationYear,String foundationCountry){
	    this.foundationYear = foundationYear;
      this.foundationCountry =  foundationCountry;
	    System.out.println("The ultimate Driving machine");
     
     }
   
     void dispBMW() {
     System.out.println("Foundation Year ; "+foundationYear);
       System.out.println("Foundation Country ; "+foundationCountry);
     }

}


class Client {



public static void maim(String[] args) {
           BMW car = new  BMW(1909,"Germany");
	   car.dispBMW();
	  
}
}
                       ///////////////////////////////////////// error ///////////////////////////////////         
