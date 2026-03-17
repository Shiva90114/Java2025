// Code - 6
// String

class StringDemo {

	public static void main(String[] args) {
	
		String str1 = "Core2Web"; 
		String str2 = "Shashi";   
		String str3 ="Core2Web"; 
                	

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
