// Code -9
// lambdaFunction with Parameter
// reduce code


interface Calculator {

	int add(int a,int b);
}
class Demo {

	public static void main(String[] args) {
	
		Calculator c = (a,b) -> a+b;
	        // (a+b) - input
		// -> - lambda operator
		// a+b -implementation 	
			System.out.println(c.add(10,20));
		
	}
}

