// Code -1
// StringBuffer
// Methods

class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer("Kanha");
		StringBuffer sb2 = new StringBuffer("Kale");

		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb2);
		
		sb1.insert(5,"Ram");
		System.out.println(sb1);
		
		sb1.delete(5,7);
		System.out.println(sb1);
 
                sb1.reverse();
		System.out.println(sb1);

	        // String str = sb1; // error : incompatible types: StringBuffer cannot be converted to String
		String str = sb1.toString();

		// IndexOf
		// System.out.println(sb1.indexOf('h')); // error  : char cannot be converted to String
		System.out.println(sb1.indexOf("h"));
                
		System.out.println(sb1.indexOf("k"));
		System.out.println(sb1.lastIndexOf("k"));

		sb1.replace(0,5,"Rohit");
		System.out.println(sb1);
		System.out.println(sb1.substring(2,4));
		System.out.println(sb2.substring(2,3));
	}
}
