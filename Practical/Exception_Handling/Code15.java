// Code -15
// Exception Handling
//Run time Exception
//NumberFormateException
//

class Demo {


	public static void main(String[] args) {
	
		String str ="abc";
		int num= Integer.parseInt(str);/*Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
                                                 at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
                                                 at java.lang.Integer.parseInt(Integer.java:580)
                                                 at java.lang.Integer.parseInt(Integer.java:615)
                                                 at Demo.main(Code15.java:13)
		                                   */
		System.out.println(num);
						   
         }
}
