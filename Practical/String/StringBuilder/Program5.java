// Code - 5
// String

class StringDemo {

	public static void main(String[] args) {
	
		String str1 = "Core2Web"; // SCP
		String str2 = "Shashi";   // SCP
		String str3 =str2.concat("Bagal");// Heap  // .concat    
                String str4 = "ShashiBagal";	// SCP	

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 == str4);

		

	}
}
