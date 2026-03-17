// Code - 3
// String

class StringDemo {

	public static void main(String[] args) {
	
		String str1 = "Kanha";           // SCp
		String str2 =new String("Kanha");// Heap

		char arr[] = {'A','B','C','D'};
		String str3 = new String(arr);// heap

		// String str4 =arr; // error // char[] cannot be converted to String

		System.out.println(str3);
	} 
}
