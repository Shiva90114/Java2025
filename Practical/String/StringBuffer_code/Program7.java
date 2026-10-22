// Code - 7
// StringBuffer

class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer(100); // Size define
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(200);
		System.out.println(sb1.capacity());
	}
}
