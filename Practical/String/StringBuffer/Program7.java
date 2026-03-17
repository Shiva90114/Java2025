// Code - 7
// Stringbuffer

class StringDemo {

	public static void main(String[] args) {
	// Size define
	
		StringBuffer sb1 = new StringBuffer(100);
		sb1 = sb1.append("Core2Web");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
	//increase Size
	         sb1 = sb1.append("Core2Web");
		 sb1.ensureCapacity(1000);
		 System.out.println(sb1);
                System.out.println(sb1.capacity());
	}
}
