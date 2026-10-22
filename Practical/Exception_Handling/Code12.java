// Code -12
// Exception Handling
//Run time Exception
//OutOfIndex Exception
//Array 


class Demo {


	public static void main(String[] args) {
	
		int arr[] = {10,20,30,40};
       		try {

		          System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("Invalid Array Index");
		}
	}
}
