// Doctor 


class Person{

	int id;
	String name;
	

	Person(int id,String name){
	
		this.id =id;
		this.name = name;
		
	}
}
class Doctor extends Person{

	String specialization;
         
	public Doctor(int doctorId,String name,String specialization){
	super(doctorId,name);
	this.specialization = specialization;
	System.out.println("Dr. "+this.name+" a "+this.specialization +" has been registered.");
	}
public void consultationFee(){
        
		int fee =0;
		switch(this.specialization.toLowerCase()){
		
                        case"cardiologist":
				fee = 2500;
				break;
			case"dermatologist":
				fee=1800;
				break;
			case"generalphysician":
				fee = 1000;
                                break;
			default:
				fee =1500;
				break;


		}
		System.out.println("---The cosultation fee for Dr. "+this.name+"("+this.specialization+") is :"+fee);
	}

}
class Clinic{

	public static void main(String[] args){
	
		System.out.println("-------Creating Doctor Profiles --------");
		Doctor doc1 = new Doctor(101,"Arun Gupta","cardiologist");
		Doctor doc2 = new Doctor(102,"Shiva Patil","dermatologist");
		Doctor doc3 = new Doctor(103,"Prajwal Pawar","generalphysician");

		System.out.println("\n----------Checking Cinsultion Fees ----------");
		doc1.consultationFee();
		doc2.consultationFee();
	        doc3.consultationFee();

	} 

}
