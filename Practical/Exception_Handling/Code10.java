// Code -10
// Exception Handling
//Run time Exception
//NullPoint Exception 


class Demo {


	public static void main(String[] args) {
	
		String name = null;

                try {

		System.out.println(name.length());
		} catch (NullPointerException e) {
		
			System.out.println("Object is null");
		}
	}
}
