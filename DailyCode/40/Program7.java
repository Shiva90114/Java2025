 // String class
 // Strong Immutable 

                                                              //*IMP*//
   
class StringDemo {

	public static void main(String[] args){
	
		String str1 = "Ram";
	        String str2 = new String("Patil");
		String str3 = "RamPatil";
                
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
	
		str1 = str1 + str2;
		 
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

	       	
	}

}
