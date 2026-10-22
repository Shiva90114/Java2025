// Code -8
// lambdaFunction
// reduce code


interface Vehicle {

	void start();
}
class Demo {

	public static void main(String[] args) {
	
		Vehicle v = () -> {
		
			System.out.println("Car is Starting");
		};
		v.start();
	}
}

