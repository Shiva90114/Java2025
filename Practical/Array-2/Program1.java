// Array
// Code - 1

class ArrayDemo {

	public static void main(String[] args) {
	
		int arr1[] = new int[]{10,20,30,40};
		System.out.println(arr1[2]);

		Integer arr2[] = new Integer[]{10,20,30,40};
                System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr2));
	}
}
