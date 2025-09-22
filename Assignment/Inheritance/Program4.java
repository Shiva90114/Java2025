// Car -Volvo


class Vehicle{

	String brand;
	String model;
	Vehicle(String brand,String model){
	
		this.brand = brand;
		this.model= model;
	}
	void VehicleDetails(){
	System.out.println("Brand : "+brand);
	System.out.println("Model : "+model);
	
	}
}
class Car extends Vehicle{

	double price;
	String fuelType;
	Car(String brand,String model,double price,String fuelType){
	 super(brand,model);
	 this.price = price;
	 this.fuelType = fuelType;
	}
	void CarDetails(){
                     VehicleDetails();
	System.out.println("Price : "+price);
	System.out.println("Fuel Type : "+fuelType);
	}
}

class CarVolvo{

	public static void main(String[] args){
	Car car  = new Car("Volvo","XC90",8000000,"Hybrid");
	car.CarDetails();
	}
}
