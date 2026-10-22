//Code -3
//String

class StringBufferDemo{

	public static void main(String[] args) {
	
		StringBuffer str1 = new StringBuffer("Shashi");
		System.out.println(str1);
                System.out.println(System.identityHashCode(str1));

		StringBuffer str2 = new StringBuffer("Bagal");
                System.out.println(str2);

 		str1 = str1.append(str2);
                
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}
