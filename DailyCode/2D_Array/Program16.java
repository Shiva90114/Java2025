// 2D Array
// Program - 16

class ArrayDemo{

	public static void main(String[] args){
	
		String str1 = "Core2Web";
		String str2 = new String("Core2Web");
		String str3 = "Core2Web";
		String str4 = new String("Core2Web");
		
		System.out.println(System.identityHashCode(str1)); //1252169911 //
		System.out.println(System.identityHashCode(str2)); //2101973421 //
		System.out.println(System.identityHashCode(str3)); //1252169911 //Same
		System.out.println(System.identityHashCode(str4)); //685325104  // Different

	}
}

