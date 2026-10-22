// Code - 2
// StringBuffer

class StringBufferDemo {

	public static void main(String[] args) {
	
		String str = "Shiva";
		StringBuffer sb  = new StringBuffer(str);
	
		sb.reverse();
		System.out.println(sb);
		str = sb.toString();
		System.out.println(str);
	}
}
