// Code -1
// String 

class StringBufferDemo {

	public static void main(String[] args) {
	
		// StringBuffer str1 = "Shashi"; // error
		StringBuffer str2 = new StringBuffer("Bagal");

		System.out.println(System.identityHashCode(str2));
		
		// str2 = str2+"Bagal"; //  error: incompatible types: String cannot be converted to StringBuffer

	}
}
