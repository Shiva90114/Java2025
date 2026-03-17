// Code - 1
// StringBuffer

class StringDemo {

	public static void main(String[] args) {
	
		// StringBuffer str1 = "Shashi"; // error: incompatible types: String cannot be converted to StringBuffer
		StringBuffer str2 = new StringBuffer("Bagal");

		System.out.println(System.identityHashCode(str2));

		// str1 = str1 +"Bagal";  // error: incompatible types: String cannot be converted to StringBuffer

		System.out.println(str2);

	}
}

