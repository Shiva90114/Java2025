// Code - 6
// StringBuffer

class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb1 = new StringBuffer();
	        	
		System.out.println(sb1); 
		System.out.println(sb1.capacity());
		sb1=sb1.append("Core2Web");
		System.out.println(sb1);
		System.out.println(sb1.capacity());// Capacity=2*(curent capacity)
		
		sb1=sb1.append("Incubators"); 
		System.out.println(sb1);
                System.out.println(sb1.capacity());

                sb1=sb1.append("Core2Web");
		System.out.println(sb1);
                System.out.println(sb1.capacity());

		sb1=sb1.append("Incubators");
                System.out.println(sb1);
                System.out.println(sb1.capacity());

		sb1=sb1.append("Core2Web");
                System.out.println(sb1);
                System.out.println(sb1.capacity());
                

	}
}
