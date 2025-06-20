class BMW {
     int foundationYear = 1916;
     String foundationCountry = "Germany";
     
     
     BMW(){
      System.out.println("The ultimate Driving machine");
     
     }
   
     void dispBMW() {
     System.out.println("Foundation Year ; "+foundationYear);
       System.out.println("Foundation Country ; "+foundationCountry);
     }

}
class Series7 extends BMW {

	String modelNum = "740d"; 
	Series7(){
	 System.out.println("Luxurious Driving");
	 }
	void dispSeries() {
	System.out.println("Model Num "+modelNum);
	}

}
class Client {



public static void maim(String[] args){
           Series7 car = new  Series7();
	   car.dispBMW();
	   car.dispSeries();

}

}
                                      // error
//
