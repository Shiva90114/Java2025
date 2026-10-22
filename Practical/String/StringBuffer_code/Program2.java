// Code -2
// String 

class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer str1 = new StringBuffer("Shashi"); // Heap
		StringBuffer str2 = new StringBuffer("Bagal"); // Heap

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		// str1 = str1 +str2;  // error: bad operand types for binary operator '+'
		str1=str1.append(str2);
                // str1 = str1.concat(str2); // only for string

	        System.out.println(str1);	
		System.out.println(System.identityHashCode(str1));

		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
	}
}
/*Output :

Shashi
Bagal
705927765
366712642
ShashiBagal
705927765
Bagal
366712642
 
*/
