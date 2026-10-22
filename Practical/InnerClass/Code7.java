// Code - 7
//InnerClass
//Anonymous Inner Class

interface Vehicle {

	void start();
} 

class Demo {

	public static void main(String[] args){
	
		Vehicle v = new Vehicle(){
		
			@Override
			public void start() {
			
				System.out.println("Car is Starting");
                        }
			
		};
		v.start();
		
		}	
	
}

