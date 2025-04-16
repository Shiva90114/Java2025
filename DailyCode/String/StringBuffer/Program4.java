class StringDemo{
	public static void main(String[] args){
		  String str1 = "Datta";
		  String str2 = "Badhe";
		  String str3 = "Badhe";
		  System.out.println(System.identityHashCode(str1));
		  str1=str1.concat(str2);
		  System.out.println(System.identityHashCode(str1));
		  }   


}

