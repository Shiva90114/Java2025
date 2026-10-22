// Code - 6
// String

class Demo {

	public static void main(String[] args) {
	
		String str1 = "Core2Web";
		String str2 = "Shiva";
		String str3 = "Core2Web";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		str3 = str3+"IIT";
		System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));
                System.out.println(System.identityHashCode(str3));
	}
}
/*Output :
 
Core2Web
Shiva
Core2Web

705927765
366712642
705927765

705927765
366712642
2133927002

*/
