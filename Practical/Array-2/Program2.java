// Array
// Code - 2

class ArrayDemo {

	public static void main(String[] args) {
	
		char arr1[] = new char[]{'A','B','C','D'};
		int arr2[] = new int[]{10,20,30,40};
		Integer arr3[] = new Integer[]{10,20,30,40};
		

		System.out.println("Char -"+arr1);
		 System.out.println("Int - "+arr2);
		 System.out.println("Integer - "+(arr3));
                System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr2));
	}
}
