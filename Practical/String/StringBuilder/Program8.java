// Code - 8
// String

class StringDemo {

	public static void main(String[] args) {
	
		String str1 = "Shashi";
		String str2 = new String("Bagal");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		str1 = str1+str2;

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));
	}
}
