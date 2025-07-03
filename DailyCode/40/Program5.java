 // String class
   
class StringDemo {

	public static void main(String[] args){
	
		String str1 = "Shivanand";
	        String str2 = new String("Shivanand");

		String str3 = "Shivanand";  
	        String str4 = new String("Shivanand");	

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		 System.out.println(str1 == str3); 
		 System.out.println(str2 == str4);
	}

}
