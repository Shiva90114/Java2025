
class Demo {

	public static void main(String[] args){
	
		int arry[] = {10,20,30,40};
		System.out.println(arry[3]);
	     //	System.out.println(arry[4]);
	
		String str = "Kanha";
		System.out.println(str.charAt(5));
	}
}
/*Exception
 * 4
 *
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        at Demo.main(Program1.java:8)
	
*5
*
* Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
        at java.lang.String.charAt(String.java:658)
        at Demo.main(Program1.java:11)	
	
	
	*/
