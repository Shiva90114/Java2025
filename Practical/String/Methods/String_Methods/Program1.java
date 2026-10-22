// Code - 1
// String 
// methods

class StringDemo {

	public static void main(String[] args) {

		String str1 = "Shiva";
		String str2 = "Phadatare";
		
		// Concat
		String result =str1.concat(str2);
		System.out.println(result);

		//  Length()
		System.out.println(str1.length());

		// charAt() // Character at Index
		System.out.println(str1.charAt(1));
		
		// compareTo()
		System.out.println(str1.compareTo(str2));

		//CompareToIgnoreCase
		String str3="SHIVA";
		System.out.println(str1.compareToIgnoreCase(str3));

		//IndexOf()
		System.out.println(str1.indexOf('S'));


		System.out.println();
	}
}
