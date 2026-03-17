// Code - 2
// StringBuffer

class StringDemo {

	public static void main(String[] args) {
	
		StringBuffer str1 =new StringBuffer("Shashi");
		StringBuffer str2 =new StringBuffer("Bagal");
		
		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));

		// str1 = str1 + str2; //error: bad operand types for binary operator '+'
		str1 = str1.append(str2);
	/*	str1=str1.concat(str2); 
	 *error: cannot find symbol
  symbol:   method concat(StringBuffer)
  location: variable str1 of type StringBuffer
1 error
*/
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		System.out.println(str2);
                System.out.println(System.identityHashCode(str2));
	}
}
