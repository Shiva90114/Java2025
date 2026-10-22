// Code - 4

class Demo {

	public static void main(String[] args) {
	
		String str1 = "Core2Web"; // SCP
                String str2 = "Shiva";  // SCP
		String str3 = str2 +"Phadatare"; // Heap
		String str4 ="ShivaPhadatare"; // SCP

		System.out.println(str1);
                System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 == str4);//
	}

}
/*Output :
 
Core2Web
Shiva
ShivaPhadatare
ShivaPhadatare
false

*/
