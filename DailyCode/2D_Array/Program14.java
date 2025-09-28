// 2D Array
// Program - 14

class ArrayDemo{

	public static void main(String[] args){
	String str1 = "Kanha";                   // SCP
	String str2 = new String("Kanha");       // Heap
	
	char arr[] = {'A','B','C','D'};
	String str3 = new String(arr); // Heap

  //	String str4 = arr;    // erroe // cannot be converted char to String.
	System.out.println(str3);

	}
}
