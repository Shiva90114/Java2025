// Code - 6
// String

class StringDemo {

	public static void main(String[] args) {
	
		String str1 = new String("Incubators");
                //System.out.println(str1.capacity());//


		StringBuffer sb2 = new StringBuffer();

		System.out.println(sb2); 
		System.out.println(sb2.capacity());

		sb2 = sb2.append("Core2Web");
		System.out.println(sb2);
		System.out.println(sb2.capacity());

		sb2 = sb2.append("Incubators");
                System.out.println(sb2);
                System.out.println(sb2.capacity());

		sb2 = sb2.append("Core2Web");
                System.out.println(sb2);
                System.out.println(sb2.capacity());

		sb2 = sb2.append("Core2Web");
                System.out.println(sb2);
                System.out.println(sb2.capacity());

		sb2=sb2.append("s");
		System.out.println(sb2);
		System.out.println(sb2.capacity());


	}
}
