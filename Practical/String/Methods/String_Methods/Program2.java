// Code - 2
// String
// Method

class StringDemo{

	public static void main(String[] args) {
	
		String str = new String("Kanha");
		System.out.println(str.concat("Kale"));
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		

		System.out.println(str.compareTo("Kanha"));
		System.out.println(str.compareTo("KANHA"));
		
		System.out.println(str.compareToIgnoreCase("KanHA"));

		System.out.println(str.indexOf('a')); // Position
		System.out.println(str.lastIndexOf('a')); // Last

		System.out.println(str.replace('a','h')); // replace 
                System.out.println(str.substring(3));// subString next
		
		System.out.println(str.toLowerCase());// LowerCase
		System.out.println(str.toUpperCase());// UpperCase


	}
}
