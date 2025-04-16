class StringDemo{
	public static void main(String[] args){
		  String str1 = "DattaBadhe";
		  
		  
		  System.out.println(System.identityHashCode(str1));
		  String str2 = "Datta" + "Badhe";
		  System.out.println(System.identityHashCode(str2));
		  }   


}

