class StringDemo{
	public static void main(String[] args){
		  String str1 = "DattaBadhe";
		  
		  String str3 = "Datta";
		  System.out.println(System.identityHashCode(str1));
		  String str2=str3 + "Badhe";
		  System.out.println(System.identityHashCode(str2));
		  }   


}

