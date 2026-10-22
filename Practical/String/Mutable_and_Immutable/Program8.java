// Code - 8
// String

class Demo {

	public static void main(String[] args) {
	
		String str1 = "Shiva";  // SCP
		String str2 = new String("Bagal"); // Haep
				
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		str1 = str1+str2;
		
		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}
}
/*Output :
 
705927765
366712642

ShivaBagal
Bagal

1735600054
366712642
 
 */
