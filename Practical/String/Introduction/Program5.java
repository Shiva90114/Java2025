// Code - 4
// String

class StringDemo {

	public static void main(String[] args) {
	
		String str1 = "Core2Web";
		String str2 = new String("Core2Web");
		String str3 = "Core2Web";
		String str4 = new String("Core2Web");
		
		if(str1==str2) {
		
			System.out.println("Equal");
		} else {
		
			System.out.println("Not equal");
		}
		if(str2==str4) {
		
			System.out.println("Equal");
		} else {
		
			System.out.println("Not equal");
		}
		if(str1==str3) {
		
			System.out.println("Equal");
		} else {
		
			System.out.println("Not equal");
		}
		if(str3==str4) {
		
			System.out.println("Equal");
		} else {
		
			System.out.println("Not equal");
		}

		System.out.println(System.identityHashCode(str1)); //1000
		System.out.println(System.identityHashCode(str2)); //2000
		System.out.println(System.identityHashCode(str3)); //1000
		System.out.println(System.identityHashCode(str4)); //3000
		
		
	} 
}
