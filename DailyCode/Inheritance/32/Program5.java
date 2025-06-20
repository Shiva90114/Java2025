class BMW {
     int foundationYear;
     String foundationCountry;
     // /*
     
     BMW(int foundationYear,String foundationCountry){
       this.foundationYear = foundationYear;
	     this.foundationCountry = foundationCountry;
	     System.out.println("The Ultimate Driving Machine");
     
     }
   // */  check 
     void dispBMW() {
     
	     System.out.println("Foundation Year ; "+foundationYear);
       System.out.println("Foundation Country ; "+foundationCountry);
     }

}
class Series7 extends BMW {

	String modelNum; 
	
	Series7(int foundationYear,String foundationCountry,String modelNum) {
	//super();
	//super(0,null);
	super(foundationYear,foundationCountry);
		this.modelNum = modelNum;
	 System.out.println("Luxurious Driving");
	 }
	void dispSeries() {
               dispBMW(); 
		System.out.println("Model Num "+modelNum);
	}

}
class Client {



public static void maim(String[] args){
           Series7 car = new  Series7(1909,"Germany","740i");
	   
	   car.dispSeries();

}

}
                                      /////////////////////// error
////////////////////////////////////////////////////error//////////////////////////////////
//
