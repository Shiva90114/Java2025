// Code - 7
// String
class Demo {

	public static void main(String[] args) {
	
		String str1 = new String("Shaahi");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		str1 = str1+"Bagal";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

	}
}
/* Output :
 
Shaahi
705927765
ShaahiBagal
21685669
 
 */
